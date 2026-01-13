package com.sl.rowset;

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
		demonstrateCachedRowSet();
	}

	private static void demonstrateCachedRowSet() throws SQLException {

		RowSetFactory factory = RowSetProvider.newFactory();

		try (CachedRowSet rowSet = factory.createCachedRowSet()) {
			loadInitialData(rowSet);

			System.out.println("Initial product data:");
			printRowSet(rowSet);
		}

	}

	private static void loadInitialData(CachedRowSet rowSet) throws SQLException {
		rowSet.setUrl(URL);
		rowSet.setUsername(USER);
		rowSet.setPassword(PASSWORD);
		rowSet.setCommand("SELECT * FROM products ORDER BY id");
		rowSet.execute();
	}

	private static void printRowSet(CachedRowSet rowSet) throws SQLException {
		System.out.printf("%-4s  %-20s  %12s \n", "ID", "Name", "Price");
		System.out.println("-".repeat(55));

		// Print each row with proper formatting
		while (rowSet.next()) {
			try {
				System.out.printf("%-4d  %-20s  %,12.2f \n", rowSet.getInt("id"), rowSet.getString("name"),
						rowSet.getFloat("price"));
			} catch (SQLException e) {
				System.err.printf("Error reading row: %s%n", e.getMessage());
			}
		}

	}

}
