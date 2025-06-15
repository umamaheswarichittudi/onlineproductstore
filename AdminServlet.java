package com.ty;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/admin")
public class AdminServlet extends HttpServlet {		
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	String uN = req.getParameter("username");
	String pW = req.getParameter("password");
	try {
	AdminBean ab = new AdminLoginDao().login(uN, pW);
	if(ab==null) {
		req.setAttribute("msg", "Invalid login process <br>");
		req.getRequestDispatcher("Msg.jsp").forward(req, resp);
	}
	else {
		HttpSession hs=req.getSession();
		hs.setAttribute("abean", ab);
		req.getRequestDispatcher("AdminLoginSucessfull.jsp").forward(req, resp);
	}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
