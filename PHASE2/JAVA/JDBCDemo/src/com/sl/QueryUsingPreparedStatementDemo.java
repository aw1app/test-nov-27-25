package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class QueryUsingPreparedStatementDemo {

	public static void main(String[] args) {
		
		System.out.println("Prepared Statement Demo");
		
		//1. Create the connection object
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		}
		
		// 2 Create the statement object
		PreparedStatement stmt = null;
		try {
			String sqlCommand = "select * from products where price>=?"; // ? is a place holder (parameter
			stmt = connection.prepareStatement(sqlCommand);
			System.out.println("Created the Statement object successfully!");
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}
		
		// 3. Execute the statement
		
		try {
			
			stmt.setFloat(1,25000.0f);
			
			ResultSet resultSet = stmt.executeQuery();
			System.out.println("Executed the Statement object successfully!");
			
			// Navigate the results (rows)
			System.out.println("List of products in the products table");
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				
				System.out.printf("%3s %20s %10s \n", id, name, price);				
			}
			
		} catch (SQLException e) {
			System.out.println("Executing the Statement object failed!!" + e);
		}

	}

}
