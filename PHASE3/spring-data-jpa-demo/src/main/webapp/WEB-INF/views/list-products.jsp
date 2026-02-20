<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<br>
LIST OF PRODUCTS
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DESCRIPTION
		<th>DETAILS
		<th>EDIT
		<th>DELETE
	</tr>

	<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.id }
			<td>${product.name }
			<td>${product.price}
			<td>${product.description}
			<td><a href="${pageContext.request.contextPath}/products/details/${product.id }"> DETAILS </a>
			<td><a href="${pageContext.request.contextPath}/products/edit-product/${product.id }"> EDIT </a>
			<td><a href="${pageContext.request.contextPath}/products/delete-product/${product.id }"> DELETE </a>
		</tr>
	</c:forEach>

</table>

