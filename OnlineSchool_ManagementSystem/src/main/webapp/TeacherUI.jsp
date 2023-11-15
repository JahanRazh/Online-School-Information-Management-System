<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Teacher</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>
	<h3>Teacher Portal</h3>


	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="tc" items="${teacherDetails}">
						<c:set var="username" value="${tc.username }"/>
							<tr>
								<td>Teacher ID</td>
								<td>${tc.TID}</td>
							</tr>
							<tr>
								<td>Teacher Name</td>
								<td>${tc.name}</td>
							</tr>
							<tr>
								<td>Teacher age</td>
								<td>${tc.age}</td>
							</tr>
							<tr>
								<td>Teacher address</td>
								<td>${tc.address}</td>
							</tr>
							<tr>
								<td>Teacher Phone</td>
								<td>${tc.phone}</td>
							</tr>
							<tr>
								<td>Teacher NIC</td>
								<td>${tc.NIC}</td>
							</tr>
							<tr>
								<td>Teacher email</td>
								<td>${tc.email}</td>
							</tr>
							<tr>
								<td>Teacher salary</td>
								<td>${tc.salary}</td>
							</tr>

					</c:forEach>
				</tbody>
			</table>
		</div>
		
		<c:url value="addSubjectUI.jsp" var="addSub">
			<c:param name="uname" value="${username}"/>
			<c:param name="subID" value="${subID}"/>
		</c:url>
		<c:url value="updateSubjectUI.jsp" var="updateSub">
			<c:param name="uname" value="${username}"/>
			<c:param name="subID" value="${subID}"/>
		</c:url>
		<c:url value="RemoveSubjectUI.jsp" var="removeSub">
			<c:param name="uname" value="${username}"/>
			<c:param name="subID" value="${subID}"/>
		</c:url>

		<div class="float-child">
			<button onclick="location.href ='${addSub}'"
				class="btn btn-primary UI-btn">Add new subject</button>
			
			<form action="ViewSubjectServlet" method="get">
				<button onclick="location.href =ViewSubjectServlet"
					class="btn btn-primary UI-btn">View Subject</button>
			</form>
			
			<button onclick="location.href ='${updateSub}'"
				class="btn btn-primary UI-btn">Update subject</button>

			<button onclick="location.href ='${removeSub}'"
				class="btn btn-primary UI-btn">Remove subject</button>

			<form action="viewNotice" method="post">
				<button onclick="location.href ='NoticesUI.jsp'"
					class="btn btn-primary UI-btn">View Notices</button>
			</form>

			<button onclick="location.href ='CreateNoticeUI.jsp'"
				class="btn btn-primary UI-btn">Create Notices</button>

			<button onclick="location.href ='updateNoticeUI.jsp'"
				class="btn btn-primary UI-btn">Update Notices</button>

			<button onclick="location.href ='RemoveNoticeUI.jsp'"
				class="btn btn-primary UI-btn">Delete Notices</button>
		</div>
	</div>


	<div class="float-container">
		<div class="float-child extra">
			<h3>Subject Details</h3>
			<table class="table table-striped">
				<tbody>
					<c:forEach var="sub" items="${subjectDetails}">
						<c:set var="subID" value="${sub.subID}"/>

							<tr>
								<td>Subject ID</td>
								<td>${sub.subID}</td>
							</tr>
							<tr>
								<td>Subject Name</td>
								<td>${sub.subName}</td>
							</tr>
							<tr>
								<td>Subject Description</td>
								<td>${sub.desc}</td>
							</tr>
							<tr>
								<td>Hours</td>
								<td>${sub.hrs}</td>
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