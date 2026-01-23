<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>


<% 

out.println("Welcome to JSPs");

%>


<% 
String helloWorld = "Hello World";
out.println("<br>");
out.println(helloWorld);

out.println("<br>");
String bye = "Have a great week end!!";
out.println("<h3>" + bye +"</h3>");


%>
