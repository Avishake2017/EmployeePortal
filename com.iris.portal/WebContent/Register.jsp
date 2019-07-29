<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
				<form action = "Register" method = "post">
				<h1>Enter details to get Registered</h1>
				</br>
				<div align = "center">
					<label>Enter your name</label>
					<input type = "text"  name ="empname" required/>
					</br>	 
					 <label>Enter your Gender</label>
					<input type = "text"  name ="gen" required/>
					</br>
					<label>Enter your qualification</label>
					<input type = "text"  name ="qual" required/>
					</br>
					<label>Enter your Contact number</label>
					<input type = "text"  name ="contact" required/>
					</br>
					<label>Enter your mail id</label>
					<input type = "text"  name ="mail" required/>
					</br>
					<label>Enter your password</label>
					<input type = "password"  name ="pass" required/>
					</br>
					<button type = "submit" >Register</button>
					</br>
				</div>
				
				</form>
</body>
</html>