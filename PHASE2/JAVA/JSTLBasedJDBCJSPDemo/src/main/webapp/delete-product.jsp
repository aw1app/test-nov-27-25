<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="jakarta.tags.sql" prefix="sql"%>
<!DOCTYPE html>


<sql:setDataSource var="estore" driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/cis_estore" user="root"
	password="rootroot" />

<sql:update dataSource="${estore}" var="count"> 
DELETE FROM products where id=<%=request.getParameter("id") %>
</sql:update>

<c:out value="Successfully deleted  ${count} product(s) with id=${param.id}" > </c:out>

<br><br>
<a href="index.jsp"> Home </a>
