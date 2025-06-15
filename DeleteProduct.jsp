<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.ty.AdminBean, java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DeleteProduct</title>

</head>
<body>

	<div class="container">
		<%
		AdminBean ab = (AdminBean) session.getAttribute("abean");
		String msg = (String) request.getAttribute("msg");
		out.println("<h2>Page Belongs to Admin : " + ab.getFname() + "</h2><br>");
		out.println("<h2>" + msg + "</h2><br>");
		%>

		<a href="Product.html">Add Product</a> <a href="view1">View All
			Products</a> <a href="logout">Logout</a>
	</div>
</body>
</html>