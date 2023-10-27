package com.pc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/callAnotherServlet")
public class CalledServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		//System.out.println("I am in CalledServlet...");
		
		// get a user input from the html form, do not print anything here
		String inputName = req.getParameter("yourname");
		
		PrintWriter out = res.getWriter();
		
		out.println("I am in CalledServlet...");
		out.println("In CalledServlet, your name is " + inputName);
	}
}
