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

</body>
</html>