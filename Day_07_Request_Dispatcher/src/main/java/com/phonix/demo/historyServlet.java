package com.phonix.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/history")
public class historyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String number = request.getParameter("number");
		CardVerify ref = new CardVerify();
		boolean data = ref.checkHistory(number);
		
		List<String> list = new ArrayList<String>();
		list.add("Bingo..:! ");
		list.add("Trademark ");
		
		HttpSession session = request.getSession();
		session.setAttribute("names", list);
		
		if( data ) {
//			PrintWriter out = response.getWriter();
//			out.println("Card History Present");
			response.sendRedirect("output.jsp");
		}
		else {
			
		}
//		doGet(request, response);
	}

}
