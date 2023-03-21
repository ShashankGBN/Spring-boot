<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome...</h1>

<!--
<%   //scriptlet tag
	String name = request.getParameter("myname");
	 out.print("Welcome....."+name);
%>
 -->

<%= //expression tag
"Welcome "+request.getParameter("myname") 
%>

<%//below tag is only for declaration %>
<%! int num = 100; %>

<h1> <%  %></h1>
</body>
</html>