<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
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
	

</script>
</head>
<body>
	<div class="container mt-5 p-5 card mx-auto col-5 bg-light">
	<form action="register" method="post">
	<h1 class="text-center text-primary mb-3"><u> Register User </u></h1>
		<div class="form-group">
				<span class="text-primary">${msg}</span>
		</div>
			<div class="form-group row mt-2">
				<label for="name" class="fw-bold col-3">UserName:</label>
				<div class="col-9">
				<input type="text" name="name" id="name" placeholder="UserName" class="form-control">
				</div>
			</div>
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
			<div class="form-group row mt-2">
				<label for="cpass" class="fw-bold col-3">Confirm Password:</label>
				<div class="col-9">
				<input type="Password" name="cpass" id="cpass" placeholder="Confirm Password" class="form-control" onkeyup="checkPass()">
				<span id="errmsg" class="text-danger"></span>
				</div>
			</div>
			<div class="form-group mt-2 row">
				<input type="submit" value="Register User" class="btn btn-success col-3 m-2">
				<input type="reset" value="Reset" class="btn btn-warning col-2 m-2">
				<a href="login.jsp" class="col-5 text-end p-2 mt-2 mx-3"> Already Have Account? Login</a>
			</div>
			
			
	</form>
	</div>
</body>
</html>