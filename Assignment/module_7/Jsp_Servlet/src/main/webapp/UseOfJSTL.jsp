<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="fun" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5 card mx-auto p-3">
	<sql:setDataSource var="dataSource" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/new" user="root" password="12345678"/>
	<sql:query var="result" dataSource="${dataSource}">select * from user_info;</sql:query>
	<h1 class="text-center text-primary">Users</h1>
	<hr>
	<table border="2px solid black" class="table">
	<tr>
	<th>Id</th>
	<th>Fname</th>
	<th>Lname</th>
	<th>Email</th>
	<th>Password</th>
	</tr>
	<c:forEach var="row" items="${result.rows}">
		<tr>
		<td>${row.id}</td>
		<td>${row.fname}</td>
		<td>${row.lname}</td>
		<td>${row.email}</td>
		<td>${row.password}</td>
		</tr>
	</c:forEach>
	</table>
	</div>
</body>
</html>