<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
CREATE NEW PRODUCT
<br>
<form action="${pageContext.request.contextPath}/product/new-product" method="POST">
	<br> Name: <input name="name">
	<br> Price : <input	name="price">
	<br> <input type="submit">
</form>

</html>