<%@ page import="com.Model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.profile-img {
	width: 100px;
	height: 100px;
	object-fit: cover;
	border-radius: 50%;
	border: 3px solid #fff;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.2);
	margin-left: 40%;
}

img {
	width: 90px;
	height: 90px;
}
</style>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand active">Profile</a>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link" href="#">Features</a>

					<form action="ProfileServlet" method="post">
						<input type="hidden" name="action" value="logout">
						<button type="submit" class="btn btn-secondary ms-5">Logout</button>
					</form>
					
					<form action="ProfileServlet" method="post"
						onsubmit="return confirm('Are you sure you want to delete your profile?');">
						<input type="hidden" name="action" value="delete">
						<div class="ms-5">
							<button type="submit" class="btn btn-danger">Delete
								Profile</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</nav>
	<%
		User u = (User) session.getAttribute("user");
		
	%>
	<div class="container mx-auto col-12">
		<h1 class="text-center text-success p-2">My Profile</h1>
	</div>
	<div class="container mx-auto col-5 card">
		<div class="mt-3">
			<img src="https://cdn-icons-png.flaticon.com/128/456/456283.png"
				alt="Profile Image" class="profile-img ">
			<p>
				<span class="badge bg-success mb-3" style='margin-left: 40%'>welcome
					<%=u.getName()%></span>
			</p>
		</div>

		<div class="text-start ps-5">
			<p>
				<strong>User Id:</strong><span><%=u.getId()%></span>
			</p>
			<p>
				<strong>Name :</strong><%=u.getName()%></p>
			<p>
				<strong>Email:</strong><%=u.getEmail()%></p>
			<p>
				<strong>Password:</strong><%=u.getPassword()%></p>
			<button class="btn btn-primary mt-2" id="editBtn">
				<a href="Edit.jsp">Edit</a>
			</button>
		</div>


	</div>
	<!-- Bootstrap JS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

</body>
</html>