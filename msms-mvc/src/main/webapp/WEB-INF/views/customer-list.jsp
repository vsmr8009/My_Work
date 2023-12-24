<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers Details</title>
<%@include file="./base.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container">
		<a href="home" class="btn btn-outline-success">Home</a>
	</div>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h1 class="text-center">Customer Details</h1>
				<table class="table table-bordered table-hover">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.No.</th>
							<th scope="col">Customer Name</th>
							<th scope="col">Customer Village</th>
							<th scope="col">Customer PinCode</th>
							<th scope="col">Customer Phone Number</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${customers}" var="customer">
							<tr>
								<th scope="row">${customer.id}</th>
								<td>${customer.name}</td>
								<td>${customer.village}</td>
								<td>${customer.pincode}</td>
								<td>${customer.phone}</td>
								<td><a href="edit-customer/${customer.id}"><i
										class="fas fa-pencil-alt mr-2" style="font-size: 25px;"></i></a> <a
									href="delete-customer/${customer.id}"><i
										class="far fa-trash-alt text-danger" style="font-size: 25px;"></i></a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>