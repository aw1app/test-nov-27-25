package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet-B")
public class ServletB extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.append("<br> Inside SERVLET B. START");

		int age = Integer.parseInt(request.getParameter("age"));

		if (age > 100 || age < 0)
			response.sendRedirect("invalid-age-to-vote");
		else
			out.append("<br> Inside SERVLET B. You have provided a valid age.");

		out.append("<br> Inside SERVLET B. END");

		out.close();
	}

}
