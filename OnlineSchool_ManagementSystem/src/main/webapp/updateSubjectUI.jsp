<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Subject</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<%
		String username = request.getParameter("uname");
	%>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>
	
	<h3>Update Subject</h3>
	<div class="float-container">
		<div class="float-child">

			<form action="updateSub" method="post">
				
				<div class="form-group">
					<label for="subID">Subject ID</label> <input type="text"
						class="form-control" id="subID" placeholder="Example input"
						name="subID" required pattern="[A-Za-z0-9]+">
				</div>
				<div class="form-group">
					<label for="teaID">Teacher ID</label> <input type="text"
						class="form-control" id="teaID" placeholder="Example input"
						name="teaID" required  pattern="[0-9]+">
				</div>
				<div class="form-group">
					<label for="name">Subject Name</label> <input type="text"
						class="form-control" id="name" placeholder="Another input"
						name="subName" required pattern="[A-Za-z]+">
				</div>
				<div class="form-group">
					<label for="subDesc">Subject Description</label> <input type="text"
						class="form-control" id="subDesc" placeholder="Example input"
						name="desc" required>
				</div>
				<div class="form-group">
					<label for="hours">Hours</label> <input type="text"
						class="form-control" id="hours" placeholder="Another input"
						name="hrs" required pattern="[0-9]+">
				</div>
		

				<button type="submit" class="btn btn-primary">Update Subject</button>
				<button onclick="location.href ='TeacherUI.jsp'" class="btn btn-secondary UI-btn">Teacher DashBoard</button>
			</form>
		</div>
	</div>
</body>
</html>