<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Notices</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>
	<h3>Subject Details</h3><button onclick="location.href ='TeacherUI.jsp'" class="btn btn-primary UI-btn">Teacher DashBoard</button>

	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="subArr" items="${subjectDetails}">
						<tr>
							<td>Subject ID:</td>
							<td>${subArr.subID}</td>
						</tr>
						<tr>
							<td>Teacher ID:</td>
							<td>${subArr.teacherID}</td>
						</tr>
						<tr>
							<td>Name:</td>
							<td>${subArr.subName}</td>
						</tr>
						<tr>
						<tr>
							<td>Description:</td>
							<td>${subArr.desc}</td>
						</tr>
						
						<tr>
							<td>hours:</td>
							<td>${subArr.hrs}</td>
						</tr>
						<tr>
							<td><br /></td>
							<td><br /></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>