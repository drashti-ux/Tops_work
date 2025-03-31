<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class = "container" >
	<form action="insert" method="post"> 
	<h1>For Add Data into Database</h1>
	<input type="number" name="uid" placeholder ="Enter UserId">
	<input type ="text" name ="name" placeholder ="Enter Username">
	<input type ="text" name ="lname" placeholder ="Enter LastName">
	<input type ="text" name ="email" placeholder ="Enter email">
	<input type ="submit">
	</form>
	<br>
	<hr>
	<form action="update" method="post"> 
	<h1>For Update Data into Database</h1>
	<input type="number" name="uid" placeholder ="Enter UserId">
	<input type ="text" name ="name" placeholder ="Enter Username">
	<input type ="text" name ="lname" placeholder ="Enter LastName">
	<input type ="text" name ="email" placeholder ="Enter email">
	<input type ="submit">
	</form>
	<br>
	<hr>
	<form action="delete" method="post"> 
	<h1>For Delete Data from Database</h1>
	<input type="number" name="uid" placeholder ="Enter UserId">
	<input type ="submit">
	</form>
	<br>
	<hr>
	<form action="search" method="post"> 
	<h1>For Search User from table</h1>
	<input type="number" name="uid" placeholder ="Enter UserId">
	<input type ="submit">
	</form>
	<br>
	<hr>
	<form action="view" method="post">
	<h1>For Search User from table</h1>
	<input type="submit" value="View Table"> 
	</form>
</div>
</body>
</html>