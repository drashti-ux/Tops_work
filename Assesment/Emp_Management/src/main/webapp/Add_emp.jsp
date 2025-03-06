<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
	<form action="add_employee" method="post">
	<div class="container card mt-5 col-6 bg-light">
	<div class="form-group row">
    	<h1 class="text-primary text-center p-2">Add Employee</h1>
    	<hr>
    	<span class="text-success text-center p-2"><b>${msg}</b></span>
  </div>
  <div class="form-group row mt-2">
    <label for="fname" class="col-sm-2 col-form-label">First Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fname" placeholder="First Name" name="fname">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="lname" class="col-sm-2 col-form-label">Last Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="lname" placeholder="Last Name" name="lname">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="email" class="col-sm-2 col-form-label"> Email:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="email" placeholder="Email" name="email">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="mobile" class="col-sm-2 col-form-label">Mobile:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mobile" placeholder="Mobile" name="mobile">
    </div>
  </div>
   <div class="form-group row mt-2">
    <label for="address" class="col-sm-2 col-form-label">Address:</label>
    <div class="col-sm-10">
     <textarea class="form-control" id="address" rows="3" placeholder="Enter your address" name="address"></textarea>
    </div>
  </div>
  <fieldset class="form-group">
    <div class="row mt-2">
        <legend class="col-form-label col-sm-2 pt-0">Gender:</legend>
        <div class="col-sm-10 d-flex align-items-center">
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" id="male" value="male">
                <label class="form-check-label" for="male">Male</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="gender" id="female" value="female">
                <label class="form-check-label" for="female">Female</label>
            </div>
        </div>
    </div>
</fieldset>
  
    <div class="form-group row mt-2">
    <label for="pw" class="col-sm-2 col-form-label">Password:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="pw" placeholder="Password" name="pass">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="cpw" class="col-sm-2 col-form-label">Confirm Password:</label>
    <div class="col-sm-10">
      <input type="password" class="form-control" id="cpw" placeholder="Confirm Password" name="cpass">
    </div>
  </div>
  <div class="form-group row mx-auto">
      <button type="submit" class="btn btn-primary my-2">Add Employee</button>
  </div>
  </div>
</form>
</body>
</html>