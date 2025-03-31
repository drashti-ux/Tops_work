<%@page import="com.Model.User"%>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
</head>
<body>
		<% 	User u = (User)session.getAttribute("user");
		%>
	<div class="container mt-5 p-5 card mx-auto col-5 bg-light">
	<form action="edit" method="post">
	<h1 class="text-center text-primary mb-3"><u> Update User </u></h1>
		<div class="form-group row mt-2">
				<label for="id" class="fw-bold col-3">UserName:</label>
				<div class="col-9">
				<input type="text" name="id" id="id" placeholder="id" class="form-control" value="<%=u.getId()%>" readonly>
				</div>
			</div>
			<div class="form-group row mt-2">
				<label for="name" class="fw-bold col-3">UserName:</label>
				<div class="col-9">
				<input type="text" name="name" id="name" placeholder="UserName" class="form-control" value="<%=u.getName()%>">
				</div>
			</div>
			<div class="form-group row mt-2">
				<label for="email" class="fw-bold col-3">Email:</label>
					<div class="col-9">
				<input type="email" name="email" id="email" placeholder="Email" class="form-control" value="<%=u.getEmail()%>">
				</div>
			</div>
			<div class="form-group row mt-2">
				<label for="pass" class="fw-bold col-3">Password:</label>
					<div class="col-9">
				<input type="password" name="pass" id="pass" placeholder="Password" class="form-control" value="<%=u.getPassword()%>">
				</div>
			</div>
			<div class="form-group mt-2 row">
				<input type="submit" value="Save Changes" class="btn btn-success col-3 m-2">
			</div>
			
			
	</form>
	</div>
</body>
</html>