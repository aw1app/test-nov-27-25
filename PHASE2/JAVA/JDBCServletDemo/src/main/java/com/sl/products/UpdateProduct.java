package com.sl.products;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update-product")
public class UpdateProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext context;

	Connection connection = null;

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
			connection = DriverManager.getConnection(dbURL, dbUser, dbPass);
			System.out.println("Connection to MySQL DB Established");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection to MySQL DB Failed with exception " + e);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.append("<br> INSIDE UPDATE Product");
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));

		PreparedStatement preparedStmt = null;
		try {
			String sqlCommand = "UPDATE products  SET name=?, price=? WHERE id=?";
			preparedStmt = connection.prepareStatement(sqlCommand);
			
			preparedStmt.clearParameters();
			preparedStmt.setString(1, name);
			preparedStmt.setFloat(2, price);
			preparedStmt.setInt(3, id);
			
			int rowcount = preparedStmt.executeUpdate();
			System.out.println("no of  rows updated "+rowcount);
			out.printf("Product updated successfully. <br>");
			
		} catch (SQLException e) {
			System.out.println("UPDATE product  failed " + e);
		};
		
		out.printf("<a href=\"index.html\" >Home</a><br>");

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

//TASK-8: Create a login form with username and password feilds. Implement
// login functionality in a Servlet.
// respond to the user to "LOGIN SUCCESS" or "LOGIN FAILED" message.
