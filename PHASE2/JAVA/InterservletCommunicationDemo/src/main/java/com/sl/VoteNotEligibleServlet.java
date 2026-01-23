package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/not-eligible-to-vote")
public class VoteNotEligibleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;   
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.append("<br> Inside VoteNotEligibleServlet. ");
		out.append("<br> You are not eligible to vote this time. ");
		
		// Do not close the writer if this servlet response is being included in some other servlet's response
		//out.close();
	}

}
