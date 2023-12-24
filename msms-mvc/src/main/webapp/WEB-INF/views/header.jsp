<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
</head>
<body>
	<nav class="navbar navbar-expand-sm bg-info navbar-dark">
		<a class="navbar-brand" href="home">Siva Pharmacy</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="home">Home</a></li>
			
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="navbardrop"
				data-toggle="dropdown"> Medicine </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="new-medicine">Add Medicine</a> <a
						class="dropdown-item" href="medicines">Medicine Details</a>
				</div></li>

			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" id="navbardrop"
				data-toggle="dropdown"> Customer </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="new-customer">Add Customer</a> <a
						class="dropdown-item" href="customers">Customer Details</a>
				</div></li>
			<li class="nav-item"><a class="nav-link" href="contact">Contact Us</a></li>
		</ul>
	</nav>
</body>
</html>