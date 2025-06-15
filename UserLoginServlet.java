package com.ui;
import java.io.*;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@SuppressWarnings("serial")
@WebServlet("/user")
public class UserLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String uN = req.getParameter("uname");
		String pW = req.getParameter("pword");
		
		UserBean ub = new UserLoginDao().login(uN, pW);
		
		if(ub == null)
		{
			req.setAttribute("msg", "Invalid Login Process...<br>");
			req.getRequestDispatcher("Msg.jsp");
		}
		else
		{
			HttpSession hs = req.getSession();  
			hs.setAttribute("ubean", ub);
			
			req.getRequestDispatcher("UserLoginSuccess.jsp").forward(req, res);
		}
	}

}
