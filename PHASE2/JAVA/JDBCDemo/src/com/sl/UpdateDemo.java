package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {

	public static void main(String[] args) {
		
		//1. Create the connection object
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		}
		
		// 2 Create the statement object
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			System.out.println("Created the Statement object successfully!");
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}
		
		// 3. Execute the statement
		String sqlCommand = "UPDATE products SET price=9999 where name like '%Printer'";
		try {
			int count = stmt.executeUpdate(sqlCommand);
			System.out.println("Executed the Statement object successfully!");
			
			// Navigate the results (rows)
			System.out.printf("Updated %d row(s) successfully!",count);
			
			
		} catch (SQLException e) {
			System.out.println("Executing the Statement object failed!!" + e);
		}

	}

}
