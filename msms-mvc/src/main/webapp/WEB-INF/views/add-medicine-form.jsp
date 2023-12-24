<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Medicine Form</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-3">Fill the Medicine details</h2>
				<form action="add-medicine" method="post">
					<div class="form-group">
						<label for="name">Medicine Name</label> <input type="text"
							class="form-control" id="name"
							placeholder="Enter the medicine name" name="name" />
					</div>
					<div class="form-group">
						<label for="company">Company Name</label> <input type="text"
							class="form-control" id="company"
							placeholder="Enter the company name" name="company" />
					</div>
					<div class="form-group">
						<label for="category">Medicine Category</label> <input type="text"
							class="form-control" id="category"
							placeholder="Enter the medicine category" name="category" />
					</div>
					<div class="form-group">
						<label for="quantity">Medicine Quantity</label> <input type="text"
							class="form-control" id="quantity"
							placeholder="Enter the medicine quantity" name="quantity" />
					</div>
					<div class="form-group">
						<label for="price">Medicine Price</label> <input type="text"
							class="form-control" id="price"
							placeholder="Enter the medicine price" name="price" />
					</div>
					<div class="text-center">
						<a href="${pageContext.request.contextPath}/home"
							class="btn btn-warning">Back</a>
						<button type="submit" class="btn btn-primary">Add
							Medicine</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>