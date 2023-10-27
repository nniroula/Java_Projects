package com.pc;

import java.io.IOException;

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
	}
}
