<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Principle</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>

	<div class="header">Online School Management System</div>
	<%@ include file="navbar.jsp"%>
	<h3>Principle Portal</h3>

	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="principle" items="${principleDetails}">
						<c:set var="username" value="${principle.username }" />

						<tr>
							<td>Principle ID</td>
							<td>${principle.PID}</td>
						</tr>
						<tr>
							<td>Principle Name</td>
							<td>${principle.name}</td>
						</tr>
						<tr>
							<td>Principle age</td>
							<td>${principle.age}</td>
						</tr>
						<tr>
							<td>Principle address</td>
							<td>${principle.address}</td>
						</tr>
						<tr>
							<td>Principle Phone</td>
							<td>${principle.phone}</td>
						</tr>
						<tr>
							<td>Principle NIC</td>
							<td>${principle.NIC}</td>
						</tr>
						

					</c:forEach>
				</tbody>
			</table>
		</div>

		
		<c:url value="createTeacherAccount.jsp" var="createTeacher">
			<c:param name="uname" value="${username}" />
		</c:url>

		<c:url value="updateTeacherAccount.jsp" var="updateTeacherAcc">
			<c:param name="uname" value="${username}" />
		</c:url>
		
		<c:url value="removeTeacherAccount.jsp" var="removeTeacherAcc">
			<c:param name="uname" value="${username}" />
		</c:url>

		<div class="float-child">
			

			<button onclick="location.href ='${createTeacher}'"
				class="btn btn-primary UI-btn">Create Teacher Account</button>

			<button onclick="location.href ='${updateTeacherAcc}'"
				class="btn btn-primary UI-btn">Update Teacher Account</button>

			<button onclick="location.href ='${removeTeacherAcc}'"
				class="btn btn-primary UI-btn">Remove Teacher Account</button>
		</div>

	</div>

</body>
</html>