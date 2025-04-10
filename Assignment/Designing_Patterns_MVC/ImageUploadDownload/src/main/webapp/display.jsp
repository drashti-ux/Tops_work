<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container col-10 mx-auto mt-5">
		<table class="table">
			<thead>
			<tr>
			<td>Student Id</td>
			<td>Student Name</td>
			<td>Email</td>
			<td>Password</td>
			<td>Profile</td>
			</tr>
			<% List<Student> studs = (List)request.getAttribute("std");
				for(Student s:studs){ 
			%>
			<tr>
			<td><%=s.getId() %></td>
			<td><img alt="<%=s.getImage() %>" src="img/<%=s.getImage() %>" width="50px" height="50px" style="border-radius:50%"></td>
			<td><%=s.getName() %></td>
			<td><%=s.getEmail() %></td>
			<td><%=s.getPassword() %></td>
			</tr>
			<%	} %>
			</thead>
		</table>
	</div>
</body>
</html>