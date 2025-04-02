<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<form action="login" method="post">
	<div class="container card mt-5 p-5 col-6 bg-light">
	<h1 class="text-primary">Login</h1>
	<hr>
	<div class="form-group">
	<label for="name">Name</label>
	<input type="text" name="name" id="name" placeholder="Enter User Name" class="form-control" value="<% if(request.getParameter("name")!=null){out.write(request.getParameter("name"));} %>">
	<span class="text-danger">${nameErr}</span>
	</div>
	<div class="form-group">
	<label for="password">Paasword</label>
	<input type="password" name="password" placeholder="Enter Password" class="form-control" value="<% if(request.getParameter("password")!=null){out.write(request.getParameter("password"));}%>">
	<span class="text-danger">${passErr}</span>
	</div>
	<div class="form-group mt-2">
	 <input type="checkbox" name="remember" value="true">Remember Me<br>
	<input type="submit" value="login" class="btn btn-primary">
	<input type="reset" value="reset" class="btn btn-warning">
	</div>
	</div>
	</form>
</body>
</html>