package com.sl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.Arrays;

public class TransactionWithSavePointDemo {

	public static void main(String[] args) throws SQLException {
		// 1. Create the connection object
				Connection connection = null;

				try {
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
					System.out.println("Connection to MySQL DB Established");
				} catch (SQLException e) {
					System.out.println("Connection to MySQL DB Failed with exception " + e);
				}

				// Enable manually commits
				connection.setAutoCommit(false);
				Savepoint savePoint1 = null,savePoint2 = null;

				try {

					String insertSQL = "INSERT INTO products (name, price) VALUES (?, ?)";
					PreparedStatement stmt = connection.prepareStatement(insertSQL);

					stmt.setString(1, "Dell AI PC 10");
					stmt.setFloat(2, 65000.0f);

					stmt.executeUpdate();
					savePoint1 = connection.setSavepoint("Savepoint1" );

					stmt.setString(1, "Dell AI PC 20");
					stmt.setFloat(2, 75000.0f);

					stmt.executeUpdate();
					savePoint2 = connection.setSavepoint("Savepoint2" );

					stmt.setString(1,
							"Dell AI PC 30 QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ");
					stmt.setFloat(2, 67000.0f);

					stmt.executeUpdate();

					stmt.setString(1, "Dell AI PC 40");
					stmt.setFloat(2, 76000.0f);

					stmt.executeUpdate();
					
					connection.commit();

					System.out.printf("products were inserted successfully");
				} catch (Exception e) {
					System.err.println("Something went wrong!");
					System.err.println(e);

					try {
						connection.rollback(savePoint1);
						System.err.println("Rollback happened!");
						connection.commit(); // don't forget to commit upto the SavePoint.
						System.err.println("Committed successfully upto the savepoint!");
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}

				connection.close();
				
				//Task-4 Try rollback to savepoint 2. verify the results!

	}

}
