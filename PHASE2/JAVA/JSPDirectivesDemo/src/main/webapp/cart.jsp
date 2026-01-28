<%@ page language="java" contentType="text/html; charset=UTF-8"
import="com.sl.*,java.util.*"
isELIgnored="false"
session="true"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Display items in the cart -->

<!-- Approach 1 using the session object -->

Item List in the cart:
<%
List<Product> products =  (List<Product>) session.getAttribute("cart");
%>

<% for(int i=0; i< products.size(); i++) { %>

<li><%=products.get(i).getName() %> , <%=products.get(i).getPrice() %>

<% } %>



<!-- Approach 2 using the EL -->
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

<hr>
Item List in the cart:
<c:forEach var="product" items="${sessionScope.cart}">
    <li>
        ${product.name} , ${product.price}
    </li>
</c:forEach>