<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Class-A Details</h3>
<br>
<table border="2px solid black">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Branch</th>
            <th>Contact</th>
            <th>Email</th>
         </tr>
         <c:forEach var="student" items="${students1}">
         <tr>
            <td>${student.getStu_Id()}</td>
            <td>${student.getStu_Name()}</td>
            <td>${student.getBranch()}</td>
            <td>${student.getContact()}</td>
            <td>${student.getEmail()}</td>
            
         </tr>
         </c:forEach>
    </table>

</body>
</html>