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
		<th>DELETE
		<th>EDIT
	</tr>

	<c:forEach var="product" items="${products}">
		<tr>
			<td>${product.id }
			<td>${product.name }
			<td>${product.price}
			<td>${product.description}
		</tr>
	</c:forEach>

</table>

