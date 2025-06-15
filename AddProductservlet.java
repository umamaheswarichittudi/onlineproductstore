package com.ty;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/addProduct")
public class AddProductservlet  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	 HttpSession hs =req.getSession(false);
	 if(hs==null) {
		 req.setAttribute("msg", "Session Expired...<br>");
			req.getRequestDispatcher("Msg.jsp").forward(req, resp);
	 }
	 else {
		 ProductBean pb= new ProductBean();
		    pb.setProductcode(req.getParameter("Productcode"));
			pb.setProductName(req.getParameter("Productname"));
			pb.setProductPrice(Double.parseDouble(req.getParameter("ProductPrice")));
			pb.setProductQuantity(Integer.parseInt(req.getParameter("qty")));
			
			int k=new AddProductDao().insert(pb);
			if (k > 0) {
				req.setAttribute("msg", "Product Added Successfully...<br>");
				req.getRequestDispatcher("AddProduct.jsp").forward(req, resp);
			}
			
	 }
	 }
	}
	

