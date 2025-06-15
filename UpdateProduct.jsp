<%@page import="java.util.*, com.ty.AdminBean, com.ty.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UpdateProduct</title>
</head>
<body>

<div class = "container">
<%
AdminBean ab = (AdminBean)session.getAttribute("abean");
String msg = (String)request.getAttribute("msg");
out.println("<h2>Page Belongs to Admin : " + ab.getFname() + "</h2><br>");
out.println("<h2>" + msg + "</h2><br>");
%>
</div>
<a href="Product.html">Add Product</a>
<a href="view1">View All Products</a>
<a href="logout">Logout</a>

</body>
</html>