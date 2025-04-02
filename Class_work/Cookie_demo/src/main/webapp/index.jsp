<%@page import="jakarta.servlet.http.Cookie"%>
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
		Cookie ck[] = request.getCookies();
		String name = "";
		String email ="";
		for(Cookie c : ck ){
			if(c.getName().equals("name")){
				name = c.getValue();
			}
			if(c.getName().equals("email")){
				email = c.getValue();
			}
		}
	%>
		<form action="reg" method="post">
		<input type="text" name="name" id="name" placeholder="name" value="<%=name%>">
		<input type="text" name="email" id="email" placeholder="email" value="<%=email%>">
		<input type="text" name="phone" id="phone" placeholder="phone">
		<input type="text" name="city" id="city" placeholder="city">
		Gender: <input type="radio" name="gender" id="genderM" value="male">Male
		<input type="radio" name="gender" id="genderF" value="female">Female
		<input type="submit">
		</form>
</body>
</html>