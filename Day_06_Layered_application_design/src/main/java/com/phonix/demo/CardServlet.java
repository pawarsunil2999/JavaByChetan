package com.phonix.demo;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//This is SERVICE LAYER

@WebServlet("/CardVerification")
public class CardServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) {

		String name = req.getParameter("name");
		String number =req.getParameter("number");
		String cvv = req.getParameter("cvv");

		Card card = new Card(name, number, cvv);

		CardVerify ref = new CardVerify();
		boolean isPresent = ref.verify(card);

		if (isPresent)
			try {
				resp.sendRedirect("next.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		else
			try {
				resp.sendRedirect("index.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
