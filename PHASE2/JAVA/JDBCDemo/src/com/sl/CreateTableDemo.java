package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

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
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			System.out.println("Created the Statement object successfully!");
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}
		
		// 3. Execute the statement
		String sqlCommand = "CREATE TABLE TABLE200(id int(8),email VARCHAR(80))";
		try {
			boolean hasResult = stmt.execute(sqlCommand); // execute method is used here for NON CRUD ops
			System.out.println("Executed the Statement object successfully!");
			
			
		} catch (SQLException e) {
			System.out.println("Executing the Statement object failed!!" + e);
		}
		
		//TASK-6: Alter the table name to TABLE500 and also add a new column mobile int 10

		connection.close();	
	}

}
