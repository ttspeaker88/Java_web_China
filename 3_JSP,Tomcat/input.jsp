<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <!DOCTYPE html> 
<html> 
<head> <meta charset="UTF-8">
	<title>User Input Form</title> 
</head> 

<body> 
<h1>Welcome! Please Enter Your Name</h1>
 <form action="greet.jsp" method="post"> 
<label for="name">Name:</label>
 <input type="text" id="name" name="userName"> 
<input type="submit" value="Submit"> 
</form> 
</body> 
</html> 
