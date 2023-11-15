<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<link href="css/login.css" rel="stylesheet">
</head>
<body>
	<div class="login-form">
		<form action="logStd" method="post"> 
			<p>User Name</p>
			<input type="text" name="username" required>
			
			<p>Password</p>
			<input type="password" name="password" required><br>
			
			<button type="submit">Log in</button>
		</form>
	</div>
</body>
</html>