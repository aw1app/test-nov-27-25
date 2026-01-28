<%@ page language="java" contentType="text/html; charset=UTF-8"
session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<!-- let's add some data in the sessionn object -->
<br> This page is setting "session.setAttribute("x", 100);"  that we can access in another page like b2.jsp
<% 
session.setAttribute("x", 100);
%>

</html>