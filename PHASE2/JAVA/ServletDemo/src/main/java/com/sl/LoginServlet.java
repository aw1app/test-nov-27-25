package com.sl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String userName = request.getParameter("username");
		String userPassword =  request.getParameter("userpasswd");
		
		
		out.append("<html> Thanks for attempting to login. ");
		out.append("<br> You submitted " + userName + " as your user name and "+ userPassword + " as your password." );
		out.append("<br> We will check against our DB and let you in! </html>");
		
		out.close();
	}

}
