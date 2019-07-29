<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<h1>Welcome  <%=session.getAttribute("userObj").toString() %> </h1>
			</br>
			<div align = "center">
			<a href = "Register.jsp">Click to register a new Employee</a>
			</br>
			<a href = "ViewProfiles">Click to view all Employee</a>
			</br>
			<a href = "SearchEmployee">Click to Search Employee By Id</a>
			</br>
			<a href = "ChangePassword">Click to change Password</a>
			</br>
			
			</div>
			
</body>
</html>