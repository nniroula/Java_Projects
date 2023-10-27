package com.pc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("In login servlet...");
		
		// retrieve user input from the html form
		String inputEmail = req.getParameter("email");  // email is value for name field in html
		String inputPassword = req.getParameter("pass"); // pass is value for name in html form
		String inputName = req.getParameter("your-name");

		// set an attribute to use in the profile.jsp page
		//req.setAttribute("fullName", "NABIN");
		req.setAttribute("fullName", inputName);
		
		if(inputEmail.equals("nabin@gmail.com") && inputPassword.equals("1234")) {
			// redirect to profile page, this is internal to the program
			//res.sendRedirect("https:/www.google.com");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			PrintWriter out = res.getWriter();
			out.println("This is profile.jsp file page");
			try {
				rd.forward(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			res.sendRedirect("profile.jsp");
			
			//RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			
		}else {
			// redirect to login page by displaying error message
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
			out.println("<h3 style='color:red'>The email and the password combination does not match.</h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/loginForm.html");
			try {
				//rd.forward(req, res); // this does not render the loginForm.html file, use include
				rd.include(req, res);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
