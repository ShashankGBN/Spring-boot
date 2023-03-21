<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Students List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>ID</th><th>Name</th><th>Branch</th><th>Contact</th><th>Email</th></tr>  
   <c:forEach var="dto" items="${dto}">   
   <tr>  
   <td>${dto.getStu_Id()}</td>  
   <td>${dto.getStu_Name()}</td>  
   <td>${dto.getBranch()}</td>  
   <td>${dto.getContact()}</td>
   <td>${dto.getEmail()}</td>    
   </tr>  
   </c:forEach>  
</table>

</body>
</html>