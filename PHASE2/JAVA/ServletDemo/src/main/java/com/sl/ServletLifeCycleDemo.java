package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/life-cycle-demo")
public class ServletLifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// Life cycle method
	public void init(ServletConfig config) {
	
		System.out.println("INSIDE init() ");		
	}
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("INSIDE doGet() ");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<h2>  You accessed the LC demo servlet </h2> ");
		
		out.close();
	}	
	
	// Life cycle method
	public void destroy() {
		
		System.out.println("INSIDE destroy() ");		
	}
	
}
