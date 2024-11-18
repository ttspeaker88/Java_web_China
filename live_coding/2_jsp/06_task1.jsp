<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head> 
    <meta charset="UTF-8">
    <title>JSP Welcome Page</title>
</head>

<body>
    <h1>Welcome to My JSP Page!</h1>
    <p>This page dynamically shows the current date and time using JSP.</p>
    <p>Current date and time:
    
    <% java.util.Date currentDate = new java.util.Date();
    out.println(currentDate.toString());
    %>
    
    </p>
</body>
</html>