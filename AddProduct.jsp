<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.ty.AdminBean" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Productadd</title>
</head>
<body>
<div class="container">
		<%
		AdminBean ab = (AdminBean) session.getAttribute("abean");
		out.println("<h2>Page Belongs to Admin : " + ab.getFname() + "</h2><br>");
		String msg = (String) request.getAttribute("msg");
		out.println("<h2>" + msg + "</h2><br>");
		%>
		<a href="Product.html">Add Product</a> 
		<a href="view1">View all Products</a>
		
	</div>
</body>
</html>