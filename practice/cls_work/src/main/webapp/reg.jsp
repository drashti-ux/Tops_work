<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<span>${msg}</span>
	<form action="reg" method="post"> 
	<input type="number" name="uid" placeholder ="Enter UserId">
	<input type ="text" name ="name" placeholder ="Enter Username">
	<input type ="text" name ="lname" placeholder ="Enter LastName">
	<input type ="text" name ="email" placeholder ="Enter email">
	<input type ="submit">
	</form>
</body>
</html>