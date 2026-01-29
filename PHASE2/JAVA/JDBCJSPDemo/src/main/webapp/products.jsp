<%@page import="java.io.StringWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.sql.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>Products</h1>

<%!
Connection connection = null;
Statement stmt =  null;
%>
<%
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");

	out.print("Connection to MySQL DB Established bbb");

	stmt = connection.createStatement();
	String sqlCommand = "select * from products";
	ResultSet resultSet = stmt.executeQuery(sqlCommand);

	out.print("<br><table border='1'>");
	out.print("<tr> <th> id <th>name<th> price");
	while (resultSet.next()) {
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		float price = resultSet.getFloat("price");

		out.print("<tr> <td> " + id + "<td>" + name + "<td>" + price);
	}
	out.print("</table><br>");

	out.print("<a href=\"index.html\" >Home</a><br>");

} catch (SQLException e) {
	System.out.println("Failed " + e);
}
%>