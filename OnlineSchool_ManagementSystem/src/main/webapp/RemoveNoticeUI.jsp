<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Notice</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>
	
	<h3>Remove Notice</h3>
	<div class="float-container">
		<div class="float-child extra" style="width: 25%">

			<form action="removeNotice" method="post">
				<div class="form-group">
					<label for="notID">Notice ID</label> <input type="text"
						class="form-control" id="notID" placeholder="Example input"
						name="id" required>
				</div>
				<button type="submit" class="btn btn-primary">Remove Notice</button>
			</form>
		</div>
	</div>
</body>
</html>