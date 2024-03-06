package com.example.servlet1;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example6")
public class ExampleServlet06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hello = "안녕하세요";
		
		// 이 문자열을 jsp에 넘겨주자
		// request에 담아서
		request.setAttribute("hello", hello);
		
		// jsp에 넘기자
		RequestDispatcher rd = 
				request.getRequestDispatcher("example6.jsp");
		
		// forward!!!!!!!!!!!!
		// 서블릿에서 jsp로 이동 : 주소는 바뀌지 않는다
		rd.forward(request, response);
	}
}
