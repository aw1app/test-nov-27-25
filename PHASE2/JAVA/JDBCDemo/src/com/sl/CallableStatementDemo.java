package com.sl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableStatementDemo {

	public static void main(String[] args) throws SQLException {
		
		//1. Create the connection object
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		}
		
		// 2 Create the statement object
		CallableStatement callableStmt = null;
		try {
			String sqlCommand = "{call add_product(?,?) }";
			callableStmt = connection.prepareCall(sqlCommand);
			System.out.println("Created the Statement object successfully!");
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}
		
		callableStmt.setString(1, "Samsung AI PC 1");
		callableStmt.setFloat(2, 100000.55f);
		
		int count = callableStmt.executeUpdate();
		System.out.printf("Inserted %d row(s) successfully!",count);
		
		connection.close();		
	}

}
