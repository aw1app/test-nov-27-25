<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<jsp:useBean id="product1" class="com.sl.Product" scope="session" />
Your are in products.jsp

You submiited a product : ${product1.name}, ${product1.price} ,  ${product1.category}, ${product1.quantity}

