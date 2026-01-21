package com.sl;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/newProduct")
public class NewProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("productName");
		String price = req.getParameter("price");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String mfgDate = req.getParameter("mfgDate");
		String category = req.getParameter("category");
		String brand = req.getParameter("brand");
		String description = req.getParameter("description");
		String source = req.getParameter("source");

		String[] features = req.getParameterValues("features");
		
		out.println("<h2>New Product Created</h2>");

        out.println("Name: " + name + "<br>");
        out.println("Price: " + price + "<br>");
        out.println("Email: " + email + "<br>");
        out.println("Manufacturing Date: " + mfgDate + "<br>");
        out.println("Category: " + category + "<br>");
        out.println("Brand: " + brand + "<br>");
        out.println("Description: " + description + "<br>");
        out.println("Source: " + source + "<br>");
        
        out.println("Features: ");
        if (features != null) {
            for (String f : features) {
                out.println(f + " ");
            }
        } else {
            out.println("None");
        }


	}

}
