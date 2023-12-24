<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container">
		<h3 class="text-center">
			Something went wrong....<br>Please Contact Support Team....!
		</h3>
		<h2>Error Response:</h2>
		<br>
		<br> <b>Time Stamp</b>: ${error.timestamp} <br>
		<br> <b>Message</b> : ${error.message} <br>
		<br> <b>Details</b> : ${error.details}
	</div>
</body>
</html>