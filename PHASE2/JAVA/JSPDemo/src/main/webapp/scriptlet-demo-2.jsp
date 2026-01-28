<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h1> Welcome to Amazon.com </h1>



<% 
java.util.Date today = new java.util.Date();

out.println("Welcome to JSPs");
out.println("Today is " + today);
%>

<br>

<!-- Print greeting based on the hour value of today -->
<% if(Integer.parseInt(today.toString().substring(11,13)) < 12) {%>

<b> "Good morning !!" </b>

<% } else { %>

"Good afternoon!!"

<% } %>

<br><br>
<!-- for loop demo -->
<% for(int i=0; i< 5 ; i++) {%>

<li> i= <%=i %>

<% } %>