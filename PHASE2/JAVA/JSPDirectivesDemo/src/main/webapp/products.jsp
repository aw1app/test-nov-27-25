<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="com.sl.*,java.util.*"
	isELIgnored="true"
	session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<%@ include file="header.jsp" %>

<h2>This page adds 2 products to the session object that can retrived in any other jsp that session object</h2>
<%!
List<Product> products = new ArrayList<Product>();
%>

<%
products.add(new Product("t-shirt",600.99f));
products.add(new Product("sweater",1900.99f));

session.setAttribute("cart", products);
%>

<hr>
<%@ include file="footer.jsp" %>
</html>