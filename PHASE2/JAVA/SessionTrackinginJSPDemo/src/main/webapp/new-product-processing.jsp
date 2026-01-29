<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1>New Product processing Page</h1>
<%
String name = request.getParameter("name");
String price = request.getParameter("price");

List<String> productNamesList = (List<String>) application.getAttribute("products");

if (productNamesList != null)
	productNamesList.add(name);
else {
	productNamesList = new ArrayList<String>();
	productNamesList.add(name);
}
application.setAttribute("products", productNamesList);

// after the adding the above product in the application object, it will
// be available in all JSPs/Servlets in this app
// even after the user has logged out

// redirect and show the products
response.sendRedirect("products.jsp");
%>
