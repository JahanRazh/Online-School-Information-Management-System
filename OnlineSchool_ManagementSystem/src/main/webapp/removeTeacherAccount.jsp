<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Teacher</title>
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

	<h3>Remove Teacher</h3>
	<div class="float-container">
		<div class="float-child extra" style="width: 25%">

			<form action="removeTeacher" method="post">
				<div class="form-group">
					<label for="admin">Admin</label> <input type="text"
						class="form-control" id="admin" placeholder="Example input"
						name="adminUname" value="<%=username%>" readonly>
				</div>
				<div class="form-group">
					<label for="teacherID">Teacher ID</label> <input type="text"
						class="form-control" id="teacherID" placeholder="Example input"
						name="teacherID" required>
				</div>
				<button type="submit" class="btn btn-primary">Remove Teacher</button>
			</form>
		</div>
	</div>
	
</body>
</html>