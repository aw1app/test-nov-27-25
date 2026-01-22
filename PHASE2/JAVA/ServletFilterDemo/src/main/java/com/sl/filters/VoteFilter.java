package com.sl.filters;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns =  {"/register-vote"})
public class VoteFilter implements Filter {
	private static final long serialVersionUID = 1L;

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("INSIDE doFilter() of VoteFilter");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int age = Integer.parseInt(request.getParameter("age"));

		if (age<18) {
			out.print("You are under 18 and therefore not eleigible to vote!");
			out.close();
			System.out.println("INSIDE doFilter() of VoteFilter's if part");
		}else {
			System.out.println("INSIDE doFilter() of VoteFilter's else part");
			chain.doFilter(request, response);
		}
		
	}

}
