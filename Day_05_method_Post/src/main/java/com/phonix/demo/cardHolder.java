package com.phonix.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cardDetails")
public class cardHolder extends HttpServlet {

	public void doPost( HttpServletRequest request, HttpServletResponse responce ) {
		String name = request.getParameter("CardHolder");
		String number = request.getParameter("number");
		String cvv = request.getParameter("cvv");
		String method = request.getMethod();
		
		System.out.println("\nMethod type : " + method + "\nName : "  + name + "\nnumber : " + number + "\ncvv : " + cvv );
		
	}


	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		doPost(req, resp);
	}
	
}
