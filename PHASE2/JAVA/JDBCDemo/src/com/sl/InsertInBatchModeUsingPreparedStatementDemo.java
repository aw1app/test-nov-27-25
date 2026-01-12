package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class InsertInBatchModeUsingPreparedStatementDemo {

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
			
			String sqlCommand = "INSERT INTO products(name,price) VALUES(?,?)";
			stmt = connection.prepareStatement(sqlCommand);			
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}
		
		// 3. Execute the statement
		
		try {			
			stmt.setString(1,"Dell AI PC 1");
			stmt.setFloat(2,65000.0f);
			
			stmt.addBatch();
			
			stmt.setString(1,"Dell AI PC 2");
			stmt.setFloat(2,75000.0f);
			
			stmt.addBatch();
			
			int[] counts = stmt.executeBatch();
			
			System.out.printf("%s products were inserted successfully",Arrays.toString(counts));
			
		} catch (SQLException e) {
			System.out.println("Executing the Statement object failed!!" + e);
		}

	}

}
