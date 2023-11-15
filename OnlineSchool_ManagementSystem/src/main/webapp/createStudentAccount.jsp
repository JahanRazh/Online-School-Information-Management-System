<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file="navbar.jsp"%>


	<h3>Create Student</h3>
	<div class="float-container">
		<div class="float-child extra" style="width: 25%">
			<form action="createStudent" method="post">

			<div class="form-group">
					<label for="sid">Student ID</label> <input type="text"
						class="form-control" id="sid" placeholder="Example input"
						name="sid" required oninput="this.value = this.value.replace(/[^0-9]/g, '');">
				</div>
				<div class="form-group">
					<label for="name">Name</label> <input type="text"
						class="form-control" id="name" placeholder="Example input"
						name="name" required>
				</div>
				<div class="form-group">
					<label for="age">Age</label> <input type="text"
						class="form-control" id="age" placeholder="Example input"
						name="age" required oninput="this.value = this.value.replace(/[^0-9]/g, '');">
				</div>
				<div class="form-group">
					<label for="address">Address</label> <input type="text"
						class="form-control" id="address" placeholder="Example input"
						name="address" required>
				</div>
				<div class="form-group">
					<label for="phone">Phone Number</label> <input type="text"
						class="form-control" id="phone" placeholder="Example input"
						name="phone" required pattern="[0-9]{9}" maxlength="9" oninput="this.value = this.value.replace(/[^0-9]/g, '');">
						<small class="form-text text-muted">Please enter a 10-digit phone number.</small>
				</div>
				<div class="form-group">
					<label for="grade">Grade</label> <input type="text"
						class="form-control" id="grade" placeholder="Example input"
						name="grade" required oninput="this.value = this.value.replace(/[^0-9]/g, '');">
						<small class="form-text text-muted">Please enter numbers only.</small>
				</div>
				<div class="form-group">
					<label for="regStatus">Reg Status</label> <input type="text"
						class="form-control" id="regStatus" placeholder="Example input"
						name="regStatus" required>
				</div>
				<div class="form-group">
					<label for="username">User Name</label> <input type="text"
						class="form-control" id="username" placeholder="Example input"
						name="username" required>
				</div>
				<div class="form-group">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" placeholder="Example input"
						name="password" required>
				</div>
				<button type="reset" class="btn btn-primary">Reset</button>
				<button type="submit" class="btn btn-primary">Create
					Student</button>
			</form>



		</div>
	</div>

</body>
</html>