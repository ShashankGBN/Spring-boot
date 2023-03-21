<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Employee Details</h3><br><br>

 <table border="2px solid black">
         <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Salary</th>
            <th>Edit</th>
         </tr>
         <c:forEach var="employee" items="${employees}">
         <tr>
            <td>${employee.getId()}</td>
            <td>${employee.getName()}</td>
            <td>${employee.getEmail()}</td>
            <td>${employee.getSalary()}</td>
            <td><a href="editemployees?id=${employee.getId()}">edit</a></td>
            </tr>
         </c:forEach>
    </table>

</body>
</html>