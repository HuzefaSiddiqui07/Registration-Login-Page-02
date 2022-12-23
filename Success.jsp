<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body style="background-color:pink;">
<h1 style="color:darkblue;">Welcome to My GitHub Account...</h1>
  <% 
  String uName = (String) request.getAttribute("name");
  out.print("Your username is >> " + uName);
  %>
</body>
</html>