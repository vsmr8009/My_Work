<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sales Form</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-3">Fill the Customer details</h2>
				<form action="add-sale" method="post">
					<div class="form-group">
						<label for="medicineId">Medicine id</label> <input type="text"
							class="form-control" id="medicineId"
							placeholder="Enter the medicine id" name="medicineId" />
					</div>
					<div class="form-group">
						<label for="customerId">Customer id</label> <input type="text"
							class="form-control" id="customerId"
							placeholder="Enter the customer id" name="customerId" />
					</div>
					<div class="form-group">
						<label for="quantity">Medicine Quantity</label> <input type="text"
							class="form-control" id="quantity"
							placeholder="Enter the medicine quantity" name="quantity" />
					</div>
					<div class="text-center">
						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-warning">Back</a>
						<button type="submit" class="btn btn-primary">Add
							Sale</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>