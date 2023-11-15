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
	<h3>Notices</h3>

	<div class="float-container">
		<div class="float-child extra">
			<table class="table table-striped">
				<tbody>
					<c:forEach var="notice" items="${noticeDetails}">
						<tr>
							<td>Notice ID:</td>
							<td>${notice.noticeID}</td>
						</tr>
						<tr>
							<td>Title:</td>
							<td>${notice.title}</td>
						</tr>
						<tr>
							<td>Description:</td>
							<td>${notice.desc}</td>
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