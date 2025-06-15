<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.ty.AdminBean, com.ty.ProductBean, java.util.ArrayList,java.util.Iterator ,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Products</title>
<style>
table{
border:2px solid black;

}
tr:nth-child(even) {
  background-color: #D6EEEE;
}
</style>
</head>
<body>
	<div class="container">
		<%
		AdminBean ab = (AdminBean) session.getAttribute("abean");
		out.println("<h2>Page Belongs to Admin : " +ab.getFname()+ "</h2><br>");
		%>
		<%
		ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("alist");

		if (al.size() == 0) {
			 %>
		<h2>No Products Available...</h2><br><%
		} else {
		
		%>
	</div>
	<table>
		<tr>
			<th>Code</th>
			<th>Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th rowpan="2">Actions</th>
		</tr>
		<%
		Iterator<ProductBean> it = al.iterator();
		while (it.hasNext()) {
			ProductBean pb = (ProductBean) it.next();
		%>
		<tr>
     <td><%=pb.getProductcode() %></td>
     <td><%=pb.getProductName() %></td>
     <td><%=pb.getProductPrice() %></td>
     <td><%=pb.getProductQuantity() %></td>	
     <td><a href='edit?pcode=<%=pb.getProductcode()%>'>edit</a>
     <a href='delete?pcode=<%=pb.getProductcode()%>'>Delete</a>
      </td>		
			
		</tr>
		<%
		}
		%>
	</table>

	<%
	}
	%>
	<a href="Product.html">Add Product</a> 
	<br>
	<a href="logout">Logout</a>
	

</body>
</html>