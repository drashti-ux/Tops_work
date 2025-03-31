<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="userInfo" method="get">
		<label for="name">Username: </label>
		<input type="text" placeholder="Enter Username" name="name" id="name">
		<label for="email">Email: </label>
		<input type="email" placeholder="Enter Email" name="email" id="email">
		<label for="phone">Phone: </label>
		<input type="text" placeholder="Enter Mobile No" name="phone" id="phone">
		<input type="submit">
	</form>
</body>
</html>