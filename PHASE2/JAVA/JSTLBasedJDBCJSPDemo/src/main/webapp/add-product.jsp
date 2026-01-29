<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.sql" prefix="sql"%>
<!DOCTYPE html>
<jsp:include page="header.jsp" ></jsp:include>

<sql:setDataSource var="estore" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/cis_estore" user="root"
	password="rootroot" />

<sql:update dataSource="${estore}" var="count"> 
INSERT INTO products(name,price) values('<%=request.getParameter("name") %>', <%=request.getParameter("price") %> )
</sql:update>

<!-- <c:out value="Successfully inserted  ${count} product(s)" > </c:out> --> 
<c:redirect url="list-products.jsp"></c:redirect>

