<%@page import="com.ty.AdminBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login Sucess</title>
</head>
<body style="font-family:times new roman; background-color: white ; text-align: center; padding-top: 100px;">
<div class="container">
 <%
 AdminBean ab=(AdminBean) session.getAttribute("abean");
 out.println("<h2>Welcome Admin : " + ab.getFname() + "</h2><br>");
 
 %>
        <button> <a href="Product.html">Add Product</a> </button>
	    <button><a href="view1">View All Products</a> </button>
		<button><a href="logout">Logout</a></button>
</div>
</body>
</html>