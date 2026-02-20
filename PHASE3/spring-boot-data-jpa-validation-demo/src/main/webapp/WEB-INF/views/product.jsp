<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<%@include file="header.jsp" %>

<link rel="stylesheet" href="${pageContext.request.contextPath}/css/product.css">


<br>
DETAILS OF PRODUCT
<br>
<div class="product-container">
	<c:if test="${product != null}">
		<div class="product-card">

			<div class="product-image">
				<img src="https://picsum.photos/300/200.jpg">
			</div>

			<div class="product-details">
				<div class="product-title">${product.name}</div>
				<div class="product-price">₹ ${product.price}</div>
				<div class="product-description">
					${product.description}
				</div>
				<div class="product-id">
					Product ID: ${product.id}
				</div>
			</div>

		</div>
	</c:if>
</div>


