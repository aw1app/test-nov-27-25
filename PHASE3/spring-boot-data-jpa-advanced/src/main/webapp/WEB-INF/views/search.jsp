<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<body>

	<form
		action="${pageContext.request.contextPath}/products/details/byname"
		method="GET">
		<input name="name"> <input type="submit" value="SEARCH BY EXACT NAME">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/products/list/byname" 
		method="GET">
		<input name="name"> <input type="submit" value="SEARCH BY NAME CONTAINING">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/products/list/byprice" 
		method="GET">
		<input name="price1"> <input name="price2"> <input type="submit" value="SEARCH BY PRICE RANGE">
	</form>
	<br>
	<form
		action="${pageContext.request.contextPath}/products/list/bynamelength" 
		method="GET">
		<input name="nameLength"> <input type="submit" value="SEARCH BY NAME LENGTH">
	</form>

</body>
</html>