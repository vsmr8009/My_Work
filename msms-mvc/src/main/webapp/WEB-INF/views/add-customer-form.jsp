<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Customer Form</title>
<%@include file="./base.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-3">Fill the Customer details</h2>
				<form action="add-customer" method="post">
					<div class="form-group">
						<label for="name">Customer Name</label> <input type="text"
							class="form-control" id="name"
							placeholder="Enter the customer name" name="name" required="required"/>
					</div>
					<div class="form-group">
						<label for="village">Customer Village</label> <input type="text"
							class="form-control" id="village"
							placeholder="Enter the customer village name" name="village" />
							<form:errors path="village"></form:errors>
					</div>
					<div class="form-group">
						<label for="pincode">Customer PinCode</label> <input type="text"
							class="form-control" id="pincode"
							placeholder="Enter the customer pincode" name="pincode" />
					</div>
					<div class="form-group">
						<label for="phone">Customer Phone</label> <input type="text"
							class="form-control" id="phone"
							placeholder="Enter the customer phone number" name="phone" />
					</div>
					<div class="text-center">
						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-warning">Back</a>
						<button type="submit" class="btn btn-primary">Add
							Customer</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>