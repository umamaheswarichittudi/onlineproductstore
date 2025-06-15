
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	%>
	<%@ page import="com.ty.AdminBean, com.ty.ProductBean, java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EditProduct</title>

</head>
<body>
	<div class="container">
		<%
		AdminBean ab = (AdminBean) session.getAttribute("abean");
		out.println("<h2>Page Belongs to Admin : " + ab.getFname() + "</h2><br>");
		String pCode = request.getParameter("pcode");
		ArrayList<ProductBean> al = (ArrayList<ProductBean>) session.getAttribute("alist");

		Iterator<ProductBean> it = al.iterator();

		while (it.hasNext()) {
			ProductBean pb = (ProductBean) it.next();

			if (pCode.equals(pb.getProductcode())) {
		%>

		<form action="update" method="post">
			<h2>Update Product Details</h2>
			<p>Update the Product Details Below</p>
			<div class="container">
					<input type="hidden" name="pcode" value=<%=pb.getProductcode()%>> 
				<label for="price">ProductPrice:</label> 
					<input type="text" id="price" name="price" value=<%=pb.getProductPrice()%>> 
				<label for="qty">ProductQuantity:</label>
					<input type="text" id="qty" name="qty" value=<%=pb.getProductQuantity()%>>
			</div>
			<input type="submit" value="Update Product">
		</form>

		<%
		break;
		}
		}
		%>
	</div>
</body>
</html>