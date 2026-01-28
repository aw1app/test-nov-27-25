<%@ page language="java" contentType="text/html; charset=UTF-8"
    info="This is JSP directive demo page"
    buffer="none"
    import="java.util.*"
    isELIgnored="true"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>


<%
Date today = new Date();
%>

<br> Today : <%= today %>

${today}

<br><br><hr>

<a href="products.jsp"> Products </a>  |  
<a href="cart.jsp"> Cart </a>
</html>