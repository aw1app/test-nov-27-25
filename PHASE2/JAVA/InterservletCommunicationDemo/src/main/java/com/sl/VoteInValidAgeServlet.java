package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/invalid-age-to-vote")
public class VoteInValidAgeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.append("<br> Inside VoteInValidAgeServlet. ");
		out.append("<br> You have provided an invalid age. ");
		
		
		out.close();
	}

}
