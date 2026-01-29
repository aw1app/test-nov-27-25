<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
String username = request.getParameter("username");
String password = request.getParameter("passwd");

if (password.equals("rootroot")) {
	session.setAttribute("username", username);
	response.sendRedirect("index.jsp");
	//out.print("Login Success!!");
} else {
	// login failed, redirect the user to login page again
	response.sendRedirect("login.html");
	//out.print("Login Failed!!");
}
%>