<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	<a href="logout">logout</a>
	<% String current = (String) application.getAttribute("cuser");
		String total = (String)application.getAttribute("tuser");
	%>
	<p>Current user:<%=current %></p>
	<p>Total User:<%=total %></p>
</body>
</html>