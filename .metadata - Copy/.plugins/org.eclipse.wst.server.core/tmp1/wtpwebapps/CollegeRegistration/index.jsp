<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>

<h1>College Management System</h1>
<form action="login">
<lable><b>User Name :: </b></lable>
<input type="text" name="u" placeholder="Enter UserName"/><br><br>
<lable><b>Password :: </b></lable>
<input type="text" name="p" placeholder="Enter Password"/><br><br>
<input type="submit" value="Login"> <br><br>
<input type=button onClick="location.href='Registration.jsp'" 
value='Sign In'>

</form>

</body>
</html>