package com.sl.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetDemo {
	// Database connection details
	private static final String URL = "jdbc:mysql://localhost:3306/cis_estore";
	private static final String USER = "root";
	private static final String PASSWORD = "rootroot";

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		con.setAutoCommit(false);

		demonstrateCachedRowSet(con);

		con.close();
	}

	private static void demonstrateCachedRowSet(Connection con) throws SQLException {

		RowSetFactory factory = RowSetProvider.newFactory();

		try (CachedRowSet rowSet = factory.createCachedRowSet()) {
			loadInitialData(rowSet, con);

			System.out.println("Initial product data:");
			printRowSet(rowSet);

			System.out.println("\nMaking offline changes...");
			rowSet.beforeFirst();
			rowSet.absolute(5); // go to fifth 5 row
			rowSet.updateFloat("price", 20000.0f);
			rowSet.updateRow();

			System.out.println("\nOffline changes successful...");

			try {
				rowSet.acceptChanges(con);
				con.commit();
			} catch (Exception e) {
				con.rollback();
				System.err.println("Rollback occurred");
				throw e;
			}
			System.out.println("Changes written to database");
		}

	}

	private static void loadInitialData(CachedRowSet rowSet, Connection con) throws SQLException {

		rowSet.setTableName("products");
		rowSet.setKeyColumns(new int[] { 1 }); // id the primary
		rowSet.setConcurrency(ResultSet.CONCUR_UPDATABLE);

		rowSet.setCommand("SELECT * FROM products");
		rowSet.execute(con);
	}

	private static void printRowSet(CachedRowSet rowSet) throws SQLException {
		System.out.printf("%-4s  %-20s  %12s \n", "ID", "Name", "Price");
		System.out.println("-".repeat(55));

		// Print each row with proper formatting
		while (rowSet.next()) {
			try {
				System.out.printf("%-4d  %-20s  %12.2f \n", rowSet.getInt("id"), rowSet.getString("name"),
						rowSet.getFloat("price"));
			} catch (SQLException e) {
				System.err.printf("Error reading row: %s%n", e.getMessage());
			}
		}

	}

}
