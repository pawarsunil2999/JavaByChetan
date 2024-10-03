package com.phonix.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/history")
public class historyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//    	TODO Auto-generated method stub
    	String number = request.getParameter("number");
    	verfyCard obj = new verfyCard();
    	boolean data = obj.checkHistory(number);
    	
    	PrintWriter out = response.getWriter();
    	
    	List<String> cardData = new ArrayList<String>();
    	cardData.add(request.getParameter("name"));
    	cardData.add(number);
    	cardData.add(request.getParameter("cvv"));
    
    	if( data ) {
//    		out.println("history checked");
    		HttpSession session = request.getSession();
    		session.setAttribute("userCard", cardData);
    		response.sendRedirect("output.jsp");
    		
    	}
    	else {
    		out.println("history not available");
    	}
    	
    	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
