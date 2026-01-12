package com.sl;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ServerMetaDataDemo {

	public static void main(String[] args) throws SQLException {

		// 1. Create the connection object
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		}

		DatabaseMetaData metadata = connection.getMetaData();

		System.out.printf("DB Server name %s \n", metadata.getDatabaseProductName()); // MySQL
		System.out.printf("DB Server version %s \n", metadata.getDatabaseProductVersion()); //

		System.out.printf("DB Server catlogs \n"); //
		ResultSet catalogs = metadata.getCatalogs();

		// Navigate the results (rows)
		System.out.println("List of catalogs");
		while (catalogs.next()) {
			String name = catalogs.getString(1);

			System.out.printf("%s  \n", name);
		}

		connection.close();
	}

}
