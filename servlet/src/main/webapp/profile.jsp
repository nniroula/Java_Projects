<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Profile page</title>
	</head>
	<body>
		<h5>I am profile page in profile.jsp file.</h5>
		
		<!-- Obtain this value from LoginServlet.java file -->
		<%
			/* request is implicit object in jsp */
			String name = (String)request.getAttribute("fullName");
		%>
		
		Welcome:- <%= name %>
	
	</body>
</html>