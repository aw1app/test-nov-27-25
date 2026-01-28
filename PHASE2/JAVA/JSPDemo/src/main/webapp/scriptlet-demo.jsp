<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1> Welcome to Amazon.com </h1>

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

<!-- Expression Tag Demo -->
<br>
<%= "<h3>" + "Contact us:+91 354367 463463" +"</h3>" %>
<%= "We are available here :" +  (3+4) %>