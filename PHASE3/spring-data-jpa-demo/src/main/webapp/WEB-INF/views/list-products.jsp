<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>


<br>
LIST OF PRODUCTS
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DESCRIPTIOHN
		<th>DETAILS
	</tr>

	<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.id }
			<td>${product.name }
			<td>${product.price}
			<td>${product.description}
			<td><a href="${pageContext.request.contextPath}/products/details/${product.id }"> DETAILS </a>
		</tr>
	</c:forEach>

</table>

