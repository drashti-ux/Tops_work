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
		$(document).ready(function(){
		loadData()
		$("#upbtn").hide()
		})
		
		const loadData=()=>{
		$.get("display",{},(rt)=>{
		var data = JSON.parse(rt)
		var rows =""
		data.map(ele=>{
			rows += "<tr><td>"+ele.id+"</td><td>"+ele.fname+"</td><td>"+ele.lname+"</td><td>"+ele.email+"</td><td>"+ele.pass+"</td><td><button class='btn btn-danger' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-primary' onclick='updateUser("+ele.id+")'>Update</button></td></tr>"
			
		})
		$("#tdata").html(rows)
		})
		}
		
		const addUser=()=>{
		var id = $("#id").val()
		var fname =$("#fname").val()
		var lname = $("#lname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
		$.post("addUser",{id,fname,lname,email,pass},(rt)=>{
			alert(rt)
			
			loadData()	// for reload the data to show the inserted data
			
			// for empty the values from form 
			$("#id").val("")
			$("#fname").val("")
			$("#lname").val("")
			$("#email").val("")
			$("#pass").val("")
		})
		}
		
		const deleteUser=(did)=>{
		 $.post("update",{"did":did,"action":"delete"},(rt)=>{
			alert(rt)
			loadData()
		 })	
		}
		
		const updateUser=(did)=>{
			$.post("update",{"did":did,"action":"update"},(rt)=>{
				var data = JSON.parse(rt)
				$("#id").val(data.id)
				$("#fname").val(data.fname)
				$("#lname").val(data.lname)
				$("#email").val(data.email)
				$("#pass").val(data.pass)
				$(".id").hide()
				$("#smtbtn").hide()
				$("#upbtn").show()
			})	
		}
		
		const editUser=()=>{
		var id = $("#id").val()
		var fname = $("#fname").val()
		var lname =$("#lname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
		$.post("editUser",{id,fname,lname,email,pass},(rt)=>{
			alert(rt)
			loadData()
			$("#id").val("")
			$("#fname").val("")
			$("#lname").val("")
			$("#email").val("")
			$("#pass").val("")
			$(".id").show()
			$("#upbtn").hide()
			$("#smtbtn").show()
		})	
		}
</script>
</head>
<body>
	<div class="conatiner">
	<div class="row">
	<div class="col-1"></div>
	<div class="col-4 mt-5 p-3 card mx-auto">
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
		<input type="submit" class="btn btn-success" value="Submit" id="smtbtn" onclick="addUser()">
		<input type="submit" class="btn btn-warning" value="Update" id="upbtn"  onclick="editUser()">
		
		</div>
	</div>
	<div class="col-1"></div>
	<div class="col-6 mt-5 p-3 card">
	<h2 class="text-primary">User Details</h2>
	<hr>
		<table class="table">
			<thead>
			<tr>
				<th>Id</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>EMail</th>
				<th>Password</th>
				<th colspan="2">Action</th>
			</tr>
			</thead>
			<tbody id="tdata">
			</tbody>
		</table>
	</div>
	</div>
	</div>

</body>
</html>