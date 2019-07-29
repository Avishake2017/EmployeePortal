<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<form action ="UpdateUserInfo" action = "post">
			<div align = "center">
					<label>Enter your id</label>
					<input type = "number" name = "id" required>
					</br>
					</br>
					<label>Enter your name</label>
					<input type = "text"  name ="empname" required/>
					</br>
					</br>	 
					 <label>Enter your Gender</label>
					<input type = "text"  name ="gen" required/>
					</br>
					</br>
					<label>Enter your qualification</label>
					<input type = "text"  name ="qual" required/>
					</br>
					</br>
					<label>Enter your Contact number</label>
					<input type = "text"  name ="contact" required/>
					</br>
					</br>
					<label>Enter your mail id</label>
					<input type = "text"  name ="mail" required/>
					</br>
					</br>
					<label>Enter your password</label>
					<input type = "password"  name ="pass" required/>
					</br>
					</br>
					<button type = "submit">Update</button>
			</form>
</body>
</html>