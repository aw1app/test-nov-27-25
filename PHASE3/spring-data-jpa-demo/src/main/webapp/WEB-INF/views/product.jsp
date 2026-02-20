<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<br>
DETAILS OF PRODUCT
<br>
<c:if  test="${product!=null}">
	<ul>
		<li>ID: ${product.id }
		<li>Name: ${product.name }
		<li>Price: ${product.price}
		<li>Description: ${product.description}
	</ul>
</c:if>	



