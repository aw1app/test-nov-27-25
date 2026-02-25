<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@include file="header.jsp" %>

<c:if test="${not empty productValidationMessage}">
    <div style="color:red">
        ${productValidationMessage}
    </div>
</c:if

<h1>CREATE NEW PRODUCT</h1>

<form action="${pageContext.request.contextPath}/products/add-product" method="POST">
<br> Name: <input  name="name"> <br>
<br> Price: <input type="number" name="price">
<br> Description: <input name="description">

<br><br><input type="submit" value="ADD PRODUCT"> 

</form>