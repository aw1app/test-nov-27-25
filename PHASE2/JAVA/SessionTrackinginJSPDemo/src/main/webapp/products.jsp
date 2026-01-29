<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<jsp:include page="header.jsp"></jsp:include>

<H2>List of products </H2>


<c:forEach var="prodName" items="${products}">
<li>${prodName}</li>
</c:forEach>