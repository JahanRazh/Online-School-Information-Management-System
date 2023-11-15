<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>

	<div class="header">Online School Information Management System</div>
	<%@ include file="navbar.jsp"%>
	<h3>Admin Portal</h3>

	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="ad" items="${adminDetails}">
						<c:set var="username" value="${ad.username }" />

						<tr>
							<td>Admin ID</td>
							<td>${ad.AID}</td>
						</tr>
						<tr>
							<td>Admin Name</td>
							<td>${ad.name}</td>
						</tr>
						<tr>
							<td>Admin age</td>
							<td>${ad.age}</td>
						</tr>
						<tr>
							<td>Admin address</td>
							<td>${ad.address}</td>
						</tr>
						<tr>
							<td>Admin Phone</td>
							<td>${ad.phone}</td>
						</tr>
						<tr>
							<td>Admin NIC</td>
							<td>${ad.NIC}</td>
						</tr>
						<tr>
							<td>Admin email</td>
							<td>${ad.email}</td>
						</tr>
						<tr>
							<td>Admin position</td>
							<td>${ad.position}</td>
						</tr>
						<tr>
							<td>Admin salary</td>
							<td>${ad.salary}</td>
						</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>

		<c:url value="createStudentAccount.jsp" var="createStd">
			<c:param name="uname" value="${username}" />
		</c:url>
		
		<c:url value="updateStudentAccount.jsp" var="updateStdAcc">
			<c:param name="uname" value="${username}" />
		</c:url>
		
		<c:url value="removeStudentAccount.jsp" var="removeStdAcc">
			<c:param name="uname" value="${username}" />
		</c:url>
		

		<div class="float-child">
			<button onclick="location.href ='${createStd}'"
				class="btn btn-primary UI-btn">Create Student Account</button>

			<button onclick="location.href ='${updateStdAcc}'"
				class="btn btn-primary UI-btn">Update Student Account</button>
				
			<button onclick="location.href ='${removeStdAcc}'"
				class="btn btn-primary UI-btn">Remove Student Account</button>	
				
			<button onclick="location.href ='stdLoginUI.jsp'"
				class="btn btn-primary UI-btn">Stu Login & View Details</button>
				
			
			
				
			
		</div>

	</div>

</body>
</html>