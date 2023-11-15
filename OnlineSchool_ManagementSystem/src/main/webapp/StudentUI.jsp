<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file="navbar.jsp"%>
	<h3>Student Portal</h3>

	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="student" items="${stdDetails}">
						<tr>
							<td>Student ID:</td>
							<td>${student.sid}</td>
						</tr>
						<tr>
							<td>Student Name:</td>
							<td>${student.name}</td>
						</tr>
						<tr>
							<td>Student age:</td>
							<td>${student.age}</td>
						</tr>
						<tr>
							<td>Student address:</td>
							<td>${student.address}</td>
						</tr>
						<tr>
							<td>Student Phone:</td>
							<td>${student.phone}</td>
						</tr>
						<tr>
							<td>Student Grade:</td>
							<td>${student.grade}</td>
						</tr>
						<tr>
							<td>Student Reg status:</td>
							<td>${student.regstatus}</td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>


			<div class="float-child">
				<form action="viewNotice" method="post">
					<button onclick="location.href ='NoticesUI.jsp'"
						class="btn btn-primary UI-btn">View Notices</button>
				</form>
				<button onclick="location.href ='Clubs.jsp'"
					class="btn btn-primary UI-btn" disabled>Enroll to clubs</button>
				<form action="showGrd" method="post">
					<button onclick="location.href ='SemesterReg.jsp'"
						class="btn btn-primary UI-btn">Semester Registration</button>
				</form>
				<button onclick="location.href ='StudyMaterials.jsp'"
					class="btn btn-primary UI-btn" disabled>View study
					materials</button>

			</div>
		</div>
</body>
</html>