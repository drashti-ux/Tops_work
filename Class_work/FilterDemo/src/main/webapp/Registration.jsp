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
	<div class="container card mt-5 p-5 col-6 bg-light">
	<form action="reg" method="post">
			
			<h1 class="mx-auto">Registration</h1>
			<hr>
			<div class="form-group">
			<label for="name">First Name</label>
			<input type ="text" placeholder="Enter First Name" class="form-control" id="name" name="name" value="<% if(request.getParameter("name")!= null){out.print(request.getParameter("name"));}%>">
			<span class="text-danger">${UserErr}</span>
			</div>
			<div class="form-group">
			<label for="lname">Last Name:</label>
			<input type="text" placeholder="Enter Last Nmae" class="form-control" id="lname" name="lname" value="<% if(request.getParameter("lname")!= null){out.print(request.getParameter("lname"));}%>">
			<span class="text-danger">${LnameErr}</span>
			</div>
			<div class="form-group">
			<label for="email">Email:</label>
			<input type="text" placeholder="Enter Email" class="form-control" id="email" name="email" value="<% if(request.getParameter("email")!= null){out.print(request.getParameter("email"));}%>">
			<span class="text-danger">${EmailErr}</span>
			</div>
			<div class="form-group">
			<label for="pass">Password:</label>
			<input type="password" placeholder="Enter Password" class="form-control" id="pass" name="pass" value="<% if(request.getParameter("pass")!= null){out.print(request.getParameter("pass"));}%>">
			<span class="text-danger">${PassErr}</span>
			</div>
			<div class="form-group mb-2">
			<input type="submit" class="btn btn-primary mt-3">
			<input type="reset" class="btn btn-warning mt-3">
			</div>
			
	</form>
		</div>
</body>
</html>