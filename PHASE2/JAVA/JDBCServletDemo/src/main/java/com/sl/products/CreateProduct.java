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

@WebServlet("/create-product")
public class CreateProduct extends HttpServlet {
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

		out.append("<br> INSIDE Create Product");
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));

		PreparedStatement preparedStmt = null;
		try {
			String sqlCommand = "INSERT INTO products(name,price) values(?,?)";
			preparedStmt = connection.prepareStatement(sqlCommand);
			
			preparedStmt.clearParameters();
			preparedStmt.setString(1, name);
			preparedStmt.setFloat(2, price);
			
			int rowcount = preparedStmt.executeUpdate();
			System.out.println("no of  rows updated "+rowcount);
			out.printf("Product Inserted successfully. <br>");
			
		} catch (SQLException e) {
			System.out.println("INSERT product  failed " + e);
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
