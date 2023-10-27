package com.pc;

import java.io.FileNotFoundException;
import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class CallingServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res){
		// use Request Dispatcher to call another servlet
		RequestDispatcher rd = req.getRequestDispatcher("CalledServlet");
		try {
			rd.forward(req, res);
//			System.out.println("In second servlet...");
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
