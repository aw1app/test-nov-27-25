<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:include page="/WEB-INF/views/header.jsp" />

<h1>CREATE NEW PRODUCT</h1>

<form action="${pageContext.request.contextPath}/products/add-product" method="POST">
<br> Name: <input name="name"> <br>
<br> Price: <input name="price">
<br> Description: <input name="description">

<br><br><input type="submit" value="ADD PRODUCT"> 

</form>