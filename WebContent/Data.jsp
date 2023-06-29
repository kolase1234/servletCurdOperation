<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
    <th>Id</th>
     <th>Fname</th>
      <th>Lname</th>
       <th>Mobile</th>
        <th>Username</th>
         <th>Password</th>
</tr>
<c:forEach var="user" items="${userlist}">
<tr>
			<td>${user.id}</td>
			<td>${user.fname}</td>
			<td>${user.lname}</td>
			<td>${user.mobile}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			
			</tr>
			</c:forEach>	

</table>
</body>
</html>