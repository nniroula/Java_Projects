package com.pc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class SignupServlet extends HttpServlet {
	// user servlet method to play with data from the html form
//	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	public void service(HttpServletRequest req, HttpServletResponse res){
		// can you get the data from html form here -> No b/c Tomcat server does not know about it
		// So, mention it in we.xml file with tags
		
		
		try {
			// signup form has name fields of firstname, lastname, email, and username. Use them to access form data
			String firstName = req.getParameter("firstname");
			String lastName = req.getParameter("lastname");
			String emailAddress = req.getParameter("email");
			String uName = req.getParameter("username");
			
			// print and see if it works yet
			System.out.println(firstName);
			// It sends the form data to the actions url of the html form, but that url does not exist yet.
			// So, No output yet in the console.
			// To fix it, you have to add SignupServlet class to the web.xml file with servlet tags
			
			 res.setContentType("text/html");
			// Once you fix that and is working, use PrintWriter class and res.getWriter() to display the response on the browser
			PrintWriter printOutput = res.getWriter();
			
			// PUT THIS IN HTML TAGS FOR DISPLAYING RESPONSE
			/*
			printOutput.println("Your full name is " + firstName + " " + lastName);
			printOutput.println("Your email is --> " + emailAddress);
			printOutput.printf("Your user name is %s ", uName );
			*/
			
			// pass html tags in the response
			printOutput.println("<html><body bgcolor='cyan'>");
			printOutput.println("<h1>" + "This is Response page via Servlet" + "</h1>");
			printOutput.println("<p>" + "Name: " + firstName + " " + lastName + "</p>");
			//printOutput.println("<p>" + lastName + "</p>");
			printOutput.println("<p>" + "Email ID: " + emailAddress + "</p>");
			printOutput.println("<p>" + "User Name: " + uName + "</p>");
			printOutput.println("</body></html>");
			
			//printOutput.println("<html><body bgcolor='red'>" + "<p>" + firstName + "</p>" + "</body></html>");
			printOutput.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
