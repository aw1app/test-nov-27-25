<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo Form processing for extracting the form data</title>
</head>
<body>

<!-- Approach 1 like we did in servlets request.getParameter("name")-->
<p>Approach 1 request.getParameter("...")</p>
<%
String name = request.getParameter("name");
String priceStr = request.getParameter("price");
float price = Float.parseFloat(priceStr);
%>

<br>
You submitted a new product with following details : <%=name %>, <%=price %>



<!-- Approach 2 using EL -->
<hr><br><p>Approach 2 using EL</p>
You submitted a new product with following details : ${param.name}, ${param.price}

</body>
</html>


<!-- TASK-4  -->
<p>Create a login form (html) for that username and password. Extract this form data in your JSP </p>