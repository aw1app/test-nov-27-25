package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register-vote")
public class VoteRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("INSIDE dopost() of VoteRegistrationServlet V2");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			
			out.println("<h2>  Your vote has been registered V2 </h2> ");
			
			out.close();
		}	
	
}
