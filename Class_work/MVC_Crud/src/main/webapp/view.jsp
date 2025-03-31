<%@page import="Model.User"%>
<%@page import="java.util.ArrayList"%>
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
	<%
		String fname = (String)session.getAttribute("fname");
		if(fname==null){
			request.setAttribute("err", "Please Login first !!!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
	%>
	<Center>${msg}</Center>
	<center>
	<table border="2px solid black">
	<thead>
		<tr>
			<th>Id</th>
			<th>FName</th>
			<th>Lname</th>
			<th>Email</th>
			<th>Actions</th>
		</tr>
	</thead>
	<tbody>
		
		<%  
			List<User> users = (List<User>)request.getAttribute("users");
			for(User usr : users){
			
		%>
		<tr>
			<td><%= usr.getId() %></td>
			<td><%= usr.getFname() %></td>
			<td><%= usr.getLname() %></td>
			<td><%= usr.getEmail() %></td>
			<td><button><a href="Edit.jsp?id=<%= usr.getId() %>">Edit</a></button>
			<button><a href="delete_user?id=<%=usr.getId() %>">Delete</a></button></td>
		</tr>
		<% } %>
		
		<tr>
			<td colspan="5"><a href="index.jsp"><center>Insert User</center></a></td>
			<td colspan="5"><a href="logout"><center>Logout</center></a></td>
		</tr>
	</tbody>
	</table>
	</center>
</body>
</html>