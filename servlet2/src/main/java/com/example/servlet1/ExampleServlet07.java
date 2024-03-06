package com.example.servlet1;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example7")
public class ExampleServlet07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String irum = "홍길동";
		Long nai = 20L;
		
		request.setAttribute("irum", irum);
		request.setAttribute("nai", nai);
		
		RequestDispatcher rd = request.getRequestDispatcher("example7.jsp");
		rd.forward(request, response);
	}

}




