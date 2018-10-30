<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display name</title>
<style type="text/css">
	.error {color: red}
</style>
</head>
<body>
	<h3>Enter Student Details</h3>
	<hr>
	<form:form action="displayForm.do" modelAttribute="customer">
		First Name : <form:input path="firstName"/><br/>
		Last Name : <form:input path="lastName"/>
		<form:errors path="lastName" cssClass="error"/><br/>
		Free Passes : <form:input path="freePass"/>
		<form:errors path="freePass" cssClass="error"/><br/>
		Zipcode : <form:input path="zipcode"/>
		<form:errors path="zipcode" cssClass="error"/><br/>
		<input type="submit" value="Click">
	</form:form>
</body>
</html>