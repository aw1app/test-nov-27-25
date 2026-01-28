<%@ page language="java" contentType="text/html; charset=UTF-8"
session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<!-- let's retrive data from the session object -->

<% 
int x = (Integer) session.getAttribute("x");
%>
<br>
Session attribute x= <%=x %>

</html>