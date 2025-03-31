<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
		const validate=()=>{
			var id = $("#id").val()
			var fname =$("#fname").val()
			var lname =$("#lname").val()
			var email = $("#email").val()
			var pass = $("#pass").val()
			$.get("validd",{id,fname,lname,email,pass},(rt)=>{
			var data = JSON.parse(rt)
			alert(rt)
			
			})
		}
		
</script>
</head>
<body>
<div class="conatiner">
	<div class="col-4 mt-5 p-5 card mx-auto">
		<h1 class="text-primary">Register</h1>
		<hr>
		<div class="form-group id">
		<label for="id">UserId</label>
		<input type="text"  id="id" placeholder="Enter UserID" class="form-control">
		</div>
		<div class="form-group">
		<label for="fname">FirstName</label>
		<input type="text"  id="fname" placeholder="Enter FirstName" class="form-control">
		</div>
		<div class="form-group">
		<label for="fname">LastName</label>
		<input type="text"  id="lname" placeholder="Enter LastName" class="form-control">
		</div>
		<div class="form-group">
		<label for="email">Email</label>
		<input type="text"  id="email" placeholder="Enter Email" class="form-control">
		</div>
		<div class="form-group">
		<label for="pass">Password</label>
		<input type="text"  id="pass" placeholder="Enter Password" class="form-control">
		</div>
		<br>
		<div class="form-group">
		<input type="submit" class="btn btn-success" value="Submit" id="smtbtn" onclick="validate()">
		
		</div>
	</div>
	</div>
</body>
</html>