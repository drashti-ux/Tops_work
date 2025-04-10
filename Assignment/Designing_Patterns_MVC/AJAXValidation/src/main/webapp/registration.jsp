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
		const checkPass =()=>{
			var pass = $("#pass").val()
			var cpass = $("#cpass").val()
			
			if(pass!==cpass){
				$("#errmsg").html("Password Did Not Match")
			}else{
				$("#errmsg").html("")
			}
		}
		const checkEmail=()=>{
			var email =$("#email").val()
			$.get("emailValidate",{email},(rt)=>{
				if(rt==="true"){
					$("#emailErr").html("Email Already Exist!!")
				}else{
					$("#emailErr").html("")
				}
			})
			}

</script>
</head>
<body>
	<div class="container card col-6 mx-auto mt-5 p-5 bg-light">
	<form action="test" method="post">
	<h1 class="text-primary text-center">Register User</h1>
	<hr>
		<span class="text-success">${msg}</span>
		<div class="form-group">
		<label for="name">Name:</label>
			<input type="text" name="name" id="name" placeholder="Enter Name" class="form-control">
		</div>
		<div class="form-group">
		<label for="email">Email:</label>
			<input type="email" name="email" id="email" placeholder="Enter Email" onblur="checkEmail()" class="form-control">
			<span class="text-danger" id="emailErr"></span>
		</div>
		<div class="form-group">
		<label for="pass" >Password:</label>
			<input type="text" name="pass" id="pass" placeholder="Enter Password" class="form-control">
		</div>
		<div class="form-group">
		<label for="cpass" >Confirm Password:</label>
			<input type="text" name="cpass" id="cpass" placeholder="Enter ConfirmPassword" class="form-control" onkeyup="checkPass()">
			<span id="errmsg" class="text-danger"></span>
		</div>
		<input type="submit" class="btn btn-primary mt-2">
		<br>
	</form>
	</div>
</body>
</html>