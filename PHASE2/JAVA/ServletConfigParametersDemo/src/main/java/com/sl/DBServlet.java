package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//@WebServlet("/init-params-demo")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext context;
	String dbURL, dbUser, dbPass;

	int counter;

	public void init(ServletConfig config) throws ServletException {
		super.init(config); // don't forget this call

		System.out.printf("INSIDE init() DBServlet");

		// get init param from the context
		context = config.getServletContext();
		dbURL = context.getInitParameter("dburl");
		dbUser = context.getInitParameter("dbuser");
		dbPass = context.getInitParameter("dbpass");

		// init param for this servlet
		counter = Integer.parseInt(config.getInitParameter("counter"));

		System.out.printf("URL=%s USER=%s PASS=%s", dbURL, dbUser, dbPass);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.printf("INFO in this servlet got through Init params <br/>URL=%s USER=%s PASS=%s", dbURL, dbUser, dbPass);
		out.printf("<br> You are vistor number %d for this servlet", ++counter);
		out.close();
	}

}
