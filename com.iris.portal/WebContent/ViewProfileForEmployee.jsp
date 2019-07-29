<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
			<%= session.getAttribute("userName")%> 
			</br>
				<%=session.getAttribute("userGender") %>
				</br>
					<%=session.getAttribute("userQualification") %>
					</br> 
					<%=session.getAttribute("userMail") %>
					</br> 
					<%=session.getAttribute("userRole") %>
</body>
</html>