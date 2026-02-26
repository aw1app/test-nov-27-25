<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>

<c:if test="${not empty message}">
	<div style="color: blue; margin-bottom: 10px;">${message}</div>
</c:if>

<br>
LIST OF TODOS
<br>
<table border=1>
	<tr style="background-color: lightgrey">
		<th>ID
		<th>USER ID
		<th>TITLE
		<th>STATUS
		<th>DELETE
	</tr>

	<c:forEach var="todo" items="${todos}">
		<tr>
			<td>${todo.id}
			<td>${todo.userId }
			<td>${todo.title}
			<td>${todo.completed}
			<td>
                    <a href="${pageContext.request.contextPath}/todos/delete-todo/${todo.id}" 
                       onclick="return confirm('Are you sure?')">
                       Delete
                    </a>
                </td>
		</tr>
	</c:forEach>

</table>