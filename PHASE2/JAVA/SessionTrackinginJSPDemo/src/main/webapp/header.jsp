<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<!DOCTYPE html>
<!-- Header -->
<div>
	<span style="font-size: 36px">Welcome to E Store</span> <span
		style="text-align: right"> <a href="products.jsp"> Products </a>
	 
	 <!-- User Greeting + Login link -->| 
	 <c:choose>
			<c:when test="${not empty sessionScope.username}">
				<span style="font-size: 16px;"> Hello ${sessionScope.username} </span>
			</c:when>
			<c:otherwise>
				<span style="font-size: 16px;"> Hello User </span>  |  
			<a style="font-size: 16px; text-align: right" href="login.html"> Login </a>
			</c:otherwise>
		</c:choose>
	</span>

</div>