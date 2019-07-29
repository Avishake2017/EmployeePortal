<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<form action = "UpdateName" method = "post">
			<label>Enter your employee id</label>
			<input type = "number"  name = "eid" required>
			</br>
			<label>Enter new Name</label>
			<input type = "text"  name = "newName" required>
			</br>
			<button type = "submit" >Go</button>
			</form>
</body>
</html>