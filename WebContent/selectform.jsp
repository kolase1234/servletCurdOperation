<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table{
  border:1px solid black;
}
</style>
</head>
<body>
<table border=1 >
<form action="Select" method="post">

Id:<input id="text" name="id" placeholder="enter id here"><br><br>
    <input class="input" type="submit"><br><br>
</form>

<table>

<tr>
    <th>Id</th>
     <th>FName</th>
      <th>LName</th>
       <th>Mobile</th>
        <th>Username</th>
         <th>Password</th>
</tr>
<tr>
			<td>${id}</td>
			<td>${fname}</td>
			<td>${lname}</td>
			<td>${mobile}</td>
			<td>${username}</td>
			<td>${password}</td>
			
			</tr>	

</table>

</body>
</html>