<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Class-B Details</h3>
<br>
<table border="2px solid black">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Email</th>
            <th>Phone</th>
         </tr>
         <c:forEach var="student" items="${students1}">
         <tr>
            <td>${student.getId()}</td>
            <td>${student.getName()}</td>
            <td>${student.getAge()}</td>
            <td>${student.getEmail()}</td>
            <td>${student.getPhone()}</td>
         </tr>
         </c:forEach>
    </table>

</body>
</html>