<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="UTF-8"> 
<title>Greeting Page</title> 
</head> 
<body> 
<h1>Greeting Page</h1> 

<% 
String userName = request.getParameter("userName");

if (userName != null && !userName.trim().isEmpty()) { 
	out.println("<h2>Hello, " + userName + "!</h2>"); } 
else { 
	out.println("<h2>Hello, Guest!</h2>"); 
	}%> 

</body> 
</html>
