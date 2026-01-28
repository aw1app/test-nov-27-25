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

<!-- TASK-3: Create an class Product with name and price. 
In one JSP (products.jsp)  create some 2 products and add them in session object as "cart". 
Then another JSP checkout.jsp display the products for billing -->