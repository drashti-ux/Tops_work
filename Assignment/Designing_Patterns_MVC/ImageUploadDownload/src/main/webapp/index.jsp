<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
</head>
<body>
	<div class="container">
	<div class="row">
		<div class="card mt-5 col-6 p-5 mx-auto">
			<form action="upimg" method="post" enctype="multipart/form-data">
			<h1>Student Register</h1>
			<hr>
				<div class="form-group">
				<label for="name">Name</label>
				<input type="text" name="name" id="name" placeholder="Enter Name" class="form-control">
				</div>
				<div class="form-group">
				<label for="email">Email</label>
				<input type="text" name="email" id="email" placeholder="Enter email" class="form-control">
				</div>
				<div class="form-group">
				<label for="pass">password</label>
				<input type="text" name="pass" id="pass" placeholder="Enter Password" class="form-control">
				</div>
				<div class="form-group">
				<label for="photo">Photo</label>
				<input type="file" name="photo" id="photo" class="form-control">
				</div>
				<div class="form-group">
				<input type="submit" class="btn btn-success mt-2 form-control">
				<a href="viewStd">View Students</a>
				</div>
			</form>
		</div>
	</div>
	</div>
</body>
</html>