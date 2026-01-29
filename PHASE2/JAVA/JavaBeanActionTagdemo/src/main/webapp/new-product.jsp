<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="product1" class="com.sl.Product" scope="session" />

<!-- 
<jsp:setProperty property="name" name="product1" param="product_name"/>
<jsp:setProperty property="price" name="product1" param="price"/>

<jsp:setProperty property="category" name="product1" param="category"/>
<jsp:setProperty property="quantity" name="product1" param="quantity"/>
 -->
 
 
 <jsp:setProperty property="*" name="product1" />

You submiited a product : ${product1.name}, ${product1.price} ,  ${product1.category}, ${product1.quantity}


<!-- TASK-9 Add 2 more properties in your product class sellerName and manufactureYear and accordingly
updated all other code in html form and your jsp. See it all works-->