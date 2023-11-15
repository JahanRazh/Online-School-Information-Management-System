<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Teacher</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Management System</div>
	<%@ include file = "navbar.jsp" %>
	
	<%
	String username = request.getParameter("uname");
	%>
	
	<h3>Update Teacher</h3>
	<div class="float-container">
		<div class="float-child extra" style="width: 25%">

			<form action="updateTeacher" method="post">
				
				<div class="form-group">
					<label for="teacherID">Teacher ID</label> <input type="text"
						class="form-control" id="teacherID" placeholder="Example input"
						name="teacherID" required>
				</div>
				<div class="form-group">
					<label for="name">Name</label> <input type="text"
						class="form-control" id="name" placeholder="Example input"
						name="name" required>
				</div>
				<div class="form-group">
					<label for="age">Age</label> <input type="text"
						class="form-control" id="age" placeholder="Example input"
						name="age" required>
				</div>
				<div class="form-group">
					<label for="nic">NIC</label> <input type="text"
						class="form-control" id="nic" placeholder="Example input"
						name="nic" required>
				</div>
				<div class="form-group">
					<label for="address">Address</label> <input type="text"
						class="form-control" id="address" placeholder="Example input"
						name="address" required>
				</div>
				<div class="form-group">
					<label for="phone">Phone Number</label> <input type="text"
						class="form-control" id="phone" placeholder="Example input"
						name="phone" required>
				</div>
				<div class="form-group">
					<label for="email">Email</label> <input type="text"
						class="form-control" id="email" placeholder="Example input"
						name="email" required>
				</div>
				<div class="form-group">
					<label for="salary">Salary</label> <input type="text"
						class="form-control" id="salary" placeholder="Example input"
						name="salary" required>
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
				<button type="submit" class="btn btn-primary">Update
					Teacher</button>
				<button type="reset" class="btn btn-primary">Reset</button>
			</form>
		</div>
	</div>
	
</body>
</html>