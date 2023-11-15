<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Semester Registration</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<link href="css/style.css" rel="stylesheet">
</head>
<body>
	<div class="header">Online School Information Management System</div>
	<%@ include file = "navbar.jsp" %>

	<h3>Semester Registration</h3>

	<div class="float-container">
		<div class="float-child">
			<h3>Grade Details</h3>
			<table class="table table-striped">
				<thead>
					<tr>
						<th scope="col">Grade</th>
						<th scope="col">Amount</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="grd" items="${grdDetails}">
						<tr>
							<td>${grd.grade}</td>
							<td>${grd.amount}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<div class="float-child extra">
			<form action="semReg" method="post">
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="id">Student ID</label> <input type="text"
							class="form-control"  placeholder="Student ID" name="id" id="id" required>
					</div>
					<div class="form-group col-md-6">
						<label for="Fname">Full Name</label> <input
							type="text" class="form-control" placeholder="Full Name" name="name" id="Fname" required>
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="phoneNo">Phone</label> <input type="text"
							class="form-control"  placeholder="Phone No" name="phone" id="phoneNo" required>
					</div>
					<div class="form-group col-md-6">
						<label for="grade">Grade</label> <input
							type="text" class="form-control" id="grade" name="grade" placeholder="Grade" required> 
					</div>
				</div>
				
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="cardNo">Card Number</label> <input type="text"
							class="form-control" id="cardNo" name="cardNo" required>
					</div>
					<div class="form-group col-md-6">
						<label for="exp">Expiry Date</label> <input type="text"
							class="form-control" id="exp" name="expDate" required>
					</div>
					<div class="form-group col-md-2">
						<label for="cvv">CVV</label> <input type="text"
							class="form-control" id="cvv" name="cvv" required>
					</div>
				</div>
				<div class="form-group" style="width: 50%;">
					<label for="amt">Amount</label> <input type="text"
						class="form-control" id="amt"
						placeholder="Amount" name="amt" required>
				</div>
				<button type="submit" class="btn btn-primary">Register</button>
			</form>
		</div>
	</div>

</body>
</html>