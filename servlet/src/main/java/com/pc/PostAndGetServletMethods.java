package com.pc;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class PostAndGetServletMethods extends HttpServlet {
	// use post method from servlet instead of service method
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			// get data from user input in html form called psotMethod.html
			String person = req.getParameter("nameitself");
			System.out.println(person);
			
			String choice = req.getParameter("selection");
			System.out.println(choice);
			
			// return user input in the form  ofthe html table
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<body bgcolor='aqua' >");
				out.println("<h1> Output in the form of the html table via servlet </h1>");
				// html table
				out.println("<table bgcolor='yellow'>");
					//table columns
					out.println("<tr>");
						// first column
						out.println("<th>");
							out.println("Name");
						out.println("</th>");
						// second column
						out.println("<th>");
							out.println("Account Type");
						out.println("</th>");
					out.println("</tr>");
					
					//cell values
					out.println("<tr>");
					// first cell
						out.println("<td>");
							out.println(person);
						out.println("</td>");
						// second cell
						out.println("<td>");
							out.println(choice);
						out.println("</td>");
					out.println("</tr>");
				out.println("</table>");
			out.println("</body>");
			out.println("</html>");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
