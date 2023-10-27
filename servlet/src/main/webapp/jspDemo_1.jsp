<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP file</title>
</head>
<body>
	<h3>My first ever JSP page...</h3>
	
	<!-- Make dynamic page -->
	<% 
		String name = "nabin";
		int leng = name.length();
	%>
	
	<!-- Print the length of the name on the web browser through Expression tag -->
	<%= leng %>
</body>
</html>