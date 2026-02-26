<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>

<br>
LIST OF TODOS
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>USER ID 
		<th>TITLE
		<th>STATUS
	</tr>

	<c:forEach var="todo" items="${todos}">
		<tr>
			<td>${todo.id }
			<td>${todo.userId }
			<td>${todo.title}
			<td>${todo.completed}
			
		</tr>
	</c:forEach>

</table>