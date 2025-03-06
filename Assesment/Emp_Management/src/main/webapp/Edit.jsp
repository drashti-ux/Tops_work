<%@page import="Dao.Emp_Dao"%>
<%@page import="Model.Employee"%>
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
	<form action="edit_employee" method="post">
	<div class="container card mt-5 col-6 bg-light">
	<div class="form-group row">
    	<h1 class="text-primary text-center p-2">Add Employee</h1>
    	<hr>
    	<span class="text-success text-center p-2"><b>${msg}</b></span>
  </div>
<% int id = Integer.parseInt(request.getParameter("id"));
	Emp_Dao dao = new Emp_Dao();
	Employee e = dao.empById(id);
%>
	<input type ="hidden" class="form-control" id="id" value="<%=e.getEmp_id() %>" name="id">
  <div class="form-group row mt-2">
    <label for="fname" class="col-sm-2 col-form-label">First Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="fname" placeholder="First Name" name="fname" value="<%=e.getFname() %>">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="lname" class="col-sm-2 col-form-label">Last Name:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="lname" placeholder="Last Name" name="lname" value="<%=e.getLname() %>">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="email" class="col-sm-2 col-form-label"> Email:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="email" placeholder="Email" name="email" value="<%=e.getEmail() %>">
    </div>
  </div>
  <div class="form-group row mt-2">
    <label for="mobile" class="col-sm-2 col-form-label">Mobile:</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="mobile" placeholder="Mobile" name="mobile" value="<%=e.getMobile() %>">
    </div>
  </div>
  <div class="form-group row mx-auto">
      <button type="submit" class="btn btn-primary my-2">Edit Employee</button>
  </div>
  </div>
</form>
</body>
</html>