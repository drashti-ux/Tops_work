<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.7.1.min.js" integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo=" crossorigin="anonymous"></script>
<script>
	$(document).ready(function(){
		loadData()
		$("#upbtn").hide()
	})
	
	const loadData=()=>{
	$.get("loadUser",{},(rt)=>{
	var data = JSON.parse(rt)
	var rows =""
	data.map(ele=>{
		rows +="<tr><td>"+ele.id+"</td><td>"+ele.fname+"</td><td>"+ele.lname+"</td><td>"+ele.email+"</td><td>"+ele.pass+"</td><td><button class='btn btn-danger' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-primary'onclick='editUser("+ele.id+")'>Update</button></td></tr>"
	})
	$("#tdata").html(rows)
	})
	}
	
	const addUser=()=>{
		var id = $("#id").val()
		var fname = $("#fname").val()
		var lname = $("#lname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
	$.post("addUser",{id,fname,lname,email,pass},(rt)=>{
		alert(rt)
		loadData()
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
	
	const editUser = (did)=>{
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
	
	const updateUser=()=>{
		var id =$("#id").val()
		var fname = $("#fname").val()
		var lname = $("#lname").val()
		var email = $("#email").val()
		var pass = $("#pass").val()
	
		$.post("edit",{id,fname,lname,email,pass},(rt)=>{
			alert(rt)
			loadData()
			$("#id").val("")
			$("#fname").val("")
			$("#lname").val("")
			$("#email").val("")
			$("#pass").val("")
			$("#smtbtn").show()
			$("#upbtn").hide()
			$(".id").show()
		})
	}
	
	const SearchUser=(value)=>{
		$.get("find",{value},(rt)=>{
			var data = JSON.parse(rt)
			var rows =""
			data.map(ele=>{
				rows +="<tr><td>"+ele.id+"</td><td>"+ele.fname+"</td><td>"+ele.lname+"</td><td>"+ele.email+"</td><td>"+ele.pass+"</td><td><button class='btn btn-danger' onclick='deleteUser("+ele.id+")'>Delete</button></td><td><button class='btn btn-primary'onclick='editUser("+ele.id+")'>Update</button></td></tr>"
			})
			$("#tdata").html(rows)
			})
	}
	
	
</script>
</head>
<body>
	<div class="container">
	<div class="row">
	<div class="col-4 mt-5 p-3 card">
	<h1>Registration Form</h1>
	<hr>
		<div class="form-group id">
		<label for="id">Id</label>
		<input type="text" id="id" placeholder="Enter UserId" class="form-control">
		</div>
		<div class="form-group">
		<label for="fname">FirstName</label>
		<input type="text" id="fname" placeholder="Enter FirstName" class="form-control">
		</div>
		<div class="form-group">
		<label for="lname">LastName</label>
		<input type="text" id="lname" placeholder="Enter LastName" class="form-control">
		</div>
		<div class="form-group">
		<label for="email">Email</label>
		<input type="text" id="email" placeholder="Enter Email" class="form-control">
		</div>
		<div class="form-group">
		<label for="pass">Password</label>
		<input type="text" id="pass" placeholder="Enter Password" class="form-control">
		</div>
		<br>
		<div class="form-group">
		<input type="submit" onclick="addUser()" class="btn btn-success" value="Submit" id="smtbtn">
		<input type="submit" onclick="updateUser()" class="btn btn-success" value="Update" id="upbtn">
		</div>
	</div>
	<div class="col-1"></div>
	<div class="col-7 mt-5 p-3 card">
	<h1 class="mx-auto">User Details</h1>
	<hr>
	<table class="table">
	
	<thead>
	
		<tr>
		<td></td>
		<td><input type="text" name="serch" id="serch" onkeyup="SearchUser(value)"></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		<td></td>
		</tr>
		 
		<tr>
		<th>Id</th>
		<th>FirstName</th>
		<th>LastName</th>
		<th>Email</th>
		<th>Password</th>
		<th colspan="2" class="text-center">Action</th>
		</tr>
	</thead>
	<tbody  id="tdata">
	</tbody>
	</table>
	</div>
	</div>
	</div>
</body>
</html>