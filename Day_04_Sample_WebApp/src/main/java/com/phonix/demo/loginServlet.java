package com.phonix.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginServlet extends HttpServlet  {
	
	public void service( HttpServletRequest request, HttpServletResponse res ) throws IOException {
		
		String userId = request.getParameter("username");
		String passWord = request.getParameter("password");
		System.out.println("User : " + userId + "\nPassword : " + passWord);
		
		ConnectDb obj = new ConnectDb();
		
		PrintWriter out = res.getWriter();
		
		if( obj.isValid(userId, passWord))
			out.println("\t\tValid User");
		else
			out.println("\t\tNot Valid User");

		
	}
}
