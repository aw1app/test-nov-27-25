<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<hr> <p> Creating variables and printing </p>
<c:set var="x1" value="101" />

<br>  x1= <c:out value="${x1}"  />

<hr> <p> Decision making </p>

<c:if test="${x1>100 }"> X1 is greater than 100 </c:if>
<c:if test="${x1< 100 }"> X1 is less than 100 </c:if>

<hr> <p> Looping </p>
<% String[] fruitNames = {"Mango", " Apple"};
pageContext.setAttribute("fruitNames", fruitNames);
%>

<c:forEach var="fr" items="${fruitNames}">
<li> ${fr}
</c:forEach>


<!-- TASK-5: Create a product object and use  jstl to print it's name and price-->