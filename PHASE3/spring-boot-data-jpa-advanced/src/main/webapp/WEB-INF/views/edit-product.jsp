<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/WEB-INF/views/header.jsp" />

<h1>EDIT PRODUCT</h1>

<form action="${pageContext.request.contextPath}/products/edit-product" method="POST">
<input type="hidden" name="id" value="${product.id}"> <br>
<br> Name: <input name="name" value="${product.name}"> <br>
<br> Price: <input name="price" value="${product.price}">
<br> Description: <input name="description" value="${product.description}">

<br><br><input type="submit" value="UPDATE PRODUCT"> 

</form>