<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Medicine Form</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h2 class="text-center mb-3">Update medicine details</h2>
				<form action="${pageContext.request.contextPath}/update-medicine"
					method="post">
					<div class="form-group">
						<label for="id">Medicine Id</label> <input type="text"
							class="form-control" id="id" placeholder="Enter the product Id"
							name="id" value="${medicine.id}" readonly="readonly" />
					</div>
					<div class="form-group">
						<label for="name">Medicine Name</label> <input type="text"
							class="form-control" id="name"
							placeholder="Enter the medicine name" name="name"
							value="${medicine.name}" />
					</div>
					<div class="form-group">
						<label for="company">Company Name</label> <input type="text"
							class="form-control" id="company"
							placeholder="Enter the company name" name="company"
							value="${medicine.company}" />
					</div>
					<div class="form-group">
						<label for="category">Medicine Category</label> <input type="text"
							class="form-control" id="category"
							placeholder="Enter the medicine category" name="category"
							value="${medicine.category}" />
					</div>
					<div class="form-group">
						<label for="quantity">Medicine Quantity</label> <input type="text"
							class="form-control" id="quantity"
							placeholder="Enter the medicine quantity" name="quantity"
							value="${medicine.quantity}" />
					</div>
					<div class="form-group">
						<label for="price">Medicine Price</label> <input type="text"
							class="form-control" id="price"
							placeholder="Enter the medicine price" name="price"
							value="${medicine.price}" />
					</div>
					<div class="text-center">
						<a href="${pageContext.request.contextPath}"
							class="btn btn-warning">Back</a>
						<button type="submit" class="btn btn-primary">Update
							Medicine</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
		</html>