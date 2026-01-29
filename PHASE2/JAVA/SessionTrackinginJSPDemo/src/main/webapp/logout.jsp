<%@ page language="java" contentType="text/html; charset=UTF-8"
	session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

session.invalidate(); // will destroy the session object for this user/user-session 

response.sendRedirect("index.jsp");

%>