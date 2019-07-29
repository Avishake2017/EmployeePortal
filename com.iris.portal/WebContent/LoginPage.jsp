<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<form action = "validateLogin" method = "post">
			<div align = "center">
			<h1>Login Page</h1>
			</div>
			
			<label>Enter your Email Id</label>
			<input type = "number" name = "empid" placeholder = "Employee ID goes here"  required>
			</br>
			<label>Enter Password</label>
			<input type = "password"  name = "pass" placeholder = "***********" required>
			</br>
			
			<button type = "submit" >LogIn</button>
			
			</form>
</body>
</html>