package com.phonix.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CardVerification")
public class CardServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String cvv = request.getParameter("cvv");

		Card card = new Card(name, number, cvv);
		verfyCard ref = new verfyCard();

		boolean isPresent = ref.verify(card);
		PrintWriter out = response.getWriter();
		
		if (isPresent) {
			out.println("Valid User");
//			response.sendRedirect("next.html");
			RequestDispatcher rd = request.getRequestDispatcher("/history");
			try {
				rd.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} 
		else {
			out.println("Not a valid User");
		}
   
	}

}
