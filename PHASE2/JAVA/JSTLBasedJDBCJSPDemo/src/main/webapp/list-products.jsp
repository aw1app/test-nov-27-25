<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.sql" prefix="sql"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" ></jsp:include>

<sql:setDataSource var="estore" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/cis_estore" user="root"
	password="rootroot" />

<sql:query dataSource="${estore}" var="resultSet"> 
SELECT * FROM products
</sql:query>


<br>LIST OF PRODUCTS <br>
<table border=1>
	<tr style="background-color:lightgrey">
		<th>ID
		<th>NAME
		<th>PRICE
		<th>DELETE
	</tr>

	<c:forEach var="row" items="${resultSet.rows}">
		<tr>
			<td>${row.id }
			<td>${row.name }
			<td> ${row.price}
			<td><a href="delete-product.jsp?id=${row.id}"> DELETE </a>
		</tr>
	</c:forEach>

</table>

<!-- TASK-12 : update the jstl sql tag code in the jsp to show only name and price in the table -->