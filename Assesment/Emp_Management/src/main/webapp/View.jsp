<%@page import="java.util.List"%>
<%@page import="Model.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List of Employees</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<!-- Employee Table -->
<table class="table mx-auto">
    <thead class="thead-dark">
        <tr>
            <th colspan="7" class="text-primary text-center"><h2>List Of Employees</h2></th>
        </tr>
        <tr>
            <th>Employee Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <% List<Employee> emp = (List) request.getAttribute("emps");
           for (Employee e : emp) { %>
        <tr>
            <td><%= e.getEmp_id() %></td>
            <td><%= e.getFname() %></td>
            <td><%= e.getLname() %></td>
            <td><%= e.getEmail() %></td>
            <td><%= e.getMobile() %></td>
            <td><a href="/Emp_Management/Edit.jsp?id=<%= e.getEmp_id() %>" class="btn btn-primary">Edit</a></td>
            <td>
                <button class="btn btn-danger delete-btn" data-id="<%= e.getEmp_id() %>" data-bs-toggle="modal" data-bs-target="#deleteModal">Delete</button>
            </td>
        </tr>
        <% } %>
    </tbody>
</table>

<!-- Delete Confirmation Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="deleteModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="deleteModalLabel">Confirm Deletion</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                Are you sure you want to delete this employee?
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
                <a href="#" id="confirmDelete" class="btn btn-danger">Delete</a>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        var deleteButtons = document.querySelectorAll(".delete-btn");
        deleteButtons.forEach(function (btn) {
            btn.addEventListener("click", function () {
                var empId = this.getAttribute("data-id");
                document.getElementById("confirmDelete").setAttribute("href", "/Emp_Management/delete?id=" + empId);
            });
        });
    });
</script>

</body>
</html>
