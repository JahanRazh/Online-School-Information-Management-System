<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>
	
	<%
	String username = request.getParameter("uname");
	%>
	
	<h3>Remove Student</h3>
	<div class="float-container">
		<div class="float-child extra" style="width: 25%">
		
			<form action="removeStudent" method="post">
				<div class="form-group">
					<label for="admin">Admin</label> <input type="text"
						class="form-control" id="admin" placeholder="Example input"
						name="adminUname" value="<%=username%>" readonly>
				</div>
				<div class="form-group">
					<label for="sid">Student ID</label> <input type="text"
						class="form-control" id="sid" placeholder="Example input"
						name="sid" required>
				</div>
				<button type="submit" class="btn btn-primary">Remove Student</button>
			</form>
		</div>
	</div>
</body>
</html>