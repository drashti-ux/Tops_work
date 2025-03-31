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
	<div class="container">
		<div class="row">
		<div class="cols-6 mx-auto card mt-3 p-5">
			<form action="/MVC_crud/insert_data" method="post">
			<h1>Registration</h1>
			<hr>
			<div class="form-group">
			<label for="id">User Id</label>
			<input type ="number" placeholder="Enter User Id" class="form-control" id="id" name="id">
			</div>
			<div class="form-group">
			<label for="fname">First Name</label>
			<input type ="text" placeholder="Enter First Name" class="form-control" id="fname" name="fname">
			</div>
			<div class="form-group">
			<label for="lname">Last Name:</label>
			<input type="text" placeholder="Enter Last Nmae" class="form-control" id="lname" name="lname">
			</div>
			<div class="form-group">
			<label for="email">Email:</label>
			<input type="text" placeholder="Enter Email" class="form-control" id="email" name="email">
			</div>
			<div class="form-group">
			<input type="submit" class="btn btn-primary mt-3">
			<input type="reset" class="btn btn-warning mt-3">
			</div>
			<span class="text-success">${msg}</span>
			</form>
		</div>
		</div>
	
	</div>
</body>
</html>