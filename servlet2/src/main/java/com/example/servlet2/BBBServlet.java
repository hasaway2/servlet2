package com.example.servlet2;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/bbb")
public class BBBServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// /aaa->/bbb로 이동하면 request는 새로 만들어진다
		// null
		System.out.println("data1:" + request.getAttribute("data1"));
	
		// session은 로그아웃할때까지 유지된다
		// data2는 출력이 된다
		HttpSession session = request.getSession();
		System.out.println("data2:" + session.getAttribute("data2"));
		
	}
}
