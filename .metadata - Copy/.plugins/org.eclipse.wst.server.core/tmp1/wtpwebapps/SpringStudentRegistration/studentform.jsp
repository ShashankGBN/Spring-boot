<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Home Page</h1>
<h3>Welcome: </h3><br>
<%= request.getAttribute("name") %><br>
<%= request.getAttribute("branch") %><br>
<%= request.getAttribute("contact") %><br>
<%= request.getAttribute("email")%><br>

</body>
</html>