package com.pc;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class AddTwoNumbers extends HttpServlet {
		public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
			// use servlet life cycle methods, one most import method is service method where you do main logic
			
			// from the html form, we get two integers
	
				// getParameter returns string, so convert it to int with Integer.ParseInt method
				int firstNumber = Integer.parseInt(req.getParameter("num1")); // num1 is name="num1" in html form
				int secondNumber = Integer.parseInt(req.getParameter("num2"));
				
				// add them
				int sum = firstNumber + secondNumber;
				
				//display the sum in console
				System.out.println("Sum is " + sum);
			
				//Display sum on the browser
				PrintWriter output = res.getWriter();
				output.println("Sum in the browser is " + sum);
				
	}
}
