package com.ty;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/view1")
public class ViewAllProductServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
	{
		HttpSession session = req.getSession(false);
		
		if(session == null)
		{
			req.setAttribute("msg", "Session Expired...<br>");
		RequestDispatcher rd  =	req .getRequestDispatcher("AdminLoginSucessfull.jsp");
		rd.forward(req, res);
		}
		else
		{
			ArrayList<ProductBean> al = new ViewAllProductsDao().retrieve();
			session.setAttribute("alist", al);
			
		RequestDispatcher rd=	req.getRequestDispatcher("ViewAllProduct.jsp");
		rd.forward(req, res);
		}
		
	}
}
