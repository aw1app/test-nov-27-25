<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<style>
.success-message {
    background-color: #e8f5e9;
    color: #2e7d32;
    padding: 12px;
    border-radius: 8px;
    margin: 20px auto;
    width: 60%;
    text-align: center;
    font-weight: bold;
    box-shadow: 0 4px 10px rgba(0,0,0,0.05);
}
</style>

<c:if test="${not empty successMessage}">
    <div class="success-message">
        ${successMessage}
    </div>
</c:if>

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

