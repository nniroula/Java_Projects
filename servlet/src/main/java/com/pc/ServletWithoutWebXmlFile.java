package com.pc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


//use servlet annotation to create an API end point

@WebServlet("/my_name")
public class ServletWithoutWebXmlFile extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("I am a servlet program without the use of web.xml file.");
		
		// retrieve the user input in html file and display that in browser
		String userName = req.getParameter("fname");
		// instantiate the printwriter in the servlet
		PrintWriter out = res.getWriter();
		out.println("Your name is " + userName);
	}
}
