<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add two numbers</title>
</head>
<body bgcolor="green">
	<%
		/* get input fromt the html form, this must be .jsp file (add.jsp) */
		int firstNumber = Integer.parseInt(request.getParameter("num1"));
		int secondNumber = Integer.parseInt(request.getParameter("num2"));
		
		int sum = firstNumber + secondNumber;
		
		out.println("sum in addTwoNumbers.jsp file is " + sum);
	%>

</body>
</html>