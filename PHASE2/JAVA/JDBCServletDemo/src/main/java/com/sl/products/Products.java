package com.sl.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/products")
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context;
	
	Connection connection = null;

	int counter;

	public void init(ServletConfig config) throws ServletException {
		super.init(config); // don't forget this call

		// get init param from the context
		String dbURL, dbUser, dbPass;
		context = config.getServletContext();
		dbURL = context.getInitParameter("dburl");
		dbUser = context.getInitParameter("dbuser");
		dbPass = context.getInitParameter("dbpass");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(dbURL,dbUser, dbPass);
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		} 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.append("<br> INSIDE QueryServlet");
		
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			String sqlCommand = "select * from products";
			ResultSet resultSet = stmt.executeQuery(sqlCommand);
			
			out.printf("<br><table border='1'>");
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				float price = resultSet.getFloat("price");
				
				out.printf("<tr> <td>%3s <td>%20s <td>%10s </tr>", id, name, price);				
			}
			out.printf("</table><br>");
			
			out.printf("<a href=\"index.html\" >Home</a><br>");
			
		} catch (SQLException e) {
			System.out.println("Creating the Statement object failed " + e);
		}	
		
		
		out.close();
	}
	
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
