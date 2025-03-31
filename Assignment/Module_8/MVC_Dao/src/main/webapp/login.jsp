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
	<div class="container mt-5 p-5 card col-5 mx-auto bg-light">
		<form action="login" method="post">
			<h1 class="text-primary text-center mb-3"><u>User Login</u></h1>
			<div class="form-group row mt-2">
				<label for="email" class="fw-bold col-3">Email:</label>
					<div class="col-9">
				<input type="email" name="email" id="email" placeholder="Email" class="form-control">
				</div>
			</div>
			<div class="form-group row mt-2">
				<label for="pass" class="fw-bold col-3">Password:</label>
					<div class="col-9">
				<input type="password" name="pass" id="pass" placeholder="Password" class="form-control">
				</div>
			</div>
			<div class="form-group mt-2">
				<input type="submit" class="btn btn-primary" value="Login">
				<input type="reset" class="btn btn-warning" value="Reset">
			</div>
		</form>
	</div>
</body>
</html>