<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="add-customer" modelAttribute="customer">
		Customer Name (*):
            <form:input path="name" />
		<form:errors path="name" cssClass="error" />
		<br>
		<br> Village Name (*):
            <form:input path="village" />
		<form:errors path="village" cssClass="error" />
		<br>
		<br> PinCode (*):
            <form:input path="pincode" />
		<form:errors path="pincode" cssClass="error" />
		<br>
		<br> Phone (*):
            <form:input path="phone" />
		<form:errors path="phone" cssClass="error" />
		<br>
		<br>
		<input type="submit" value="Register" />

	</form:form>
</body>
</html>