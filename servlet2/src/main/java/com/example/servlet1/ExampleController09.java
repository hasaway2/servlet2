package com.example.servlet1;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
// jsp : html + 자바
import javax.servlet.http.*;

// M : Model - 데이터
// V : View - 데이터를 출력하는 화면(현재는 jsp)
// C : Conotrlller - 사용자 요청을 접수하고(url) 적당한 뷰와 연결
// == model2

@WebServlet("/example9")
public class ExampleController09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// forward : jsp 화면을 보여준다
		//           주소는 그대로 -> 같은 작업
		RequestDispatcher rd 
			= request.getRequestDispatcher("input9.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 처리 결과를 보여주거나...(다른 곳으로 이동)
		Long val1 = Long.parseLong(request.getParameter("val1"));
		Long val2 = Long.parseLong(request.getParameter("val2"));
		Long result = val1 * val2;
		
		request.setAttribute("result", result);
			
		RequestDispatcher rd 
			= request.getRequestDispatcher("result9.jsp");
		rd.forward(request, response);
	}
}












