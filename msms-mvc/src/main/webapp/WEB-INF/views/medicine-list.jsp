<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Medicines Details</title>
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
				<h1 class="text-center">Medicine Details</h1>
				<table class="table table-bordered table-hover">
					<thead class="thead-dark">
						<tr>
							<th scope="col">S.No.</th>
							<th scope="col">Medicine Name</th>
							<th scope="col">Company Name</th>
							<th scope="col">Medicine Quantity</th>
							<th scope="col">Medicine Category</th>
							<th scope="col">Medicine Price</th>
							<th scope="col">Actions</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${medicines}" var="medicine">
							<tr>
								<th scope="row">${medicine.id}</th>
								<td>${medicine.name}</td>
								<td>${medicine.company}</td>
								<td>${medicine.category}</td>
								<td>${medicine.quantity}</td>
								<td class="font-weight-bold">&#X20B9; ${medicine.price}</td>
								<td><a href="edit-medicine/${medicine.id}"><i class="fas fa-edit" style="font-size: 25px"></i></a> 
								<a href="delete-medicine/${medicine.id}"><i class="fas fa-trash-alt" style="font-size: 25px"></i></a>
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