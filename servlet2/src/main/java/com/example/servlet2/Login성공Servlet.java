package com.example.servlet2;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/success")
public class Login성공Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 여부 확인
		HttpSession session = request.getSession();
		
		// 
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/servlet2/login");
		} else {
			RequestDispatcher rd 
			= request.getRequestDispatcher("로그인성공.jsp");
			rd.forward(request, response);
		}
	}
}











