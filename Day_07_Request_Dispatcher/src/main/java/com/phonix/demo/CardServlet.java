package com.phonix.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//This is SERVICE LAYER

@WebServlet("/CardVerification")
public class CardServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String name = req.getParameter("name");
		String number =req.getParameter("number");
		String cvv = req.getParameter("cvv");

		Card card = new Card(name, number, cvv);

		CardVerify ref = new CardVerify();
		boolean isPresent = ref.verify(card);
		PrintWriter out = resp.getWriter();
//		out.println("Valid card checked :)");

		if (isPresent) {
			RequestDispatcher rd = req.getRequestDispatcher("history");
			rd.forward(req, resp);
		} else
			try {
				resp.sendRedirect("index.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
