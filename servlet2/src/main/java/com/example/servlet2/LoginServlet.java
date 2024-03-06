package com.example.servlet2;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	// 로그인 화면을 보여준다
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd
		= request.getRequestDispatcher("로그인.jsp");
		rd.forward(request, response);
	}
	
	// 로그인을 처리
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 아이디가 spring, 비밀번호가 1234면 성공
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if(username.equals("spring")&&password.equals("1234")) {
			HttpSession session = request.getSession();
			// 로그인에 성공하면 세션에 아이디를 저장
			session.setAttribute("username", username);
			response.sendRedirect("/servlet2/success");
		} else {
			response.sendRedirect("/servlet2/login");
		}
	}

}




