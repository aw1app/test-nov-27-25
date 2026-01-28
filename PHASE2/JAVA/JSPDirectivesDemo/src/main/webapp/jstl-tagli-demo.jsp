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

<hr> <p> switch demo </p>
<%
    int marks = 82;
pageContext.setAttribute("marks", marks);
%>
Marks: <c:out value="${marks}" /><br>
<c:choose>
	<c:when test="${marks>60 }">First class marks</c:when>
	<c:when test="${marks>50 }">Seconds class marks</c:when>
	<c:when test="${marks>40 }">Third class marks</c:when>
	<c:otherwise>FAIL</c:otherwise>
</c:choose>


<hr> <p> splitting a string in to tokens </p>
<c:forTokens items="Apple,Mango,Banana,Orange"
             delims=","
             var="fruit">
    ${fruit} <br>
</c:forTokens>


<hr> <p> handling exceptions </p>
<c:catch var="ex">
${"x1" / 0}
</c:catch>

<c:if test="${ex != null}">
    Error Occurred: ${ex.message}
</c:if>

<br>FOOTER TEXT

<br>