<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display name</title>
</head>
<body>
	<h3>Enter Student Details</h3>
	<hr>
	<form:form action="displayForm.do" modelAttribute="student">
		First Name : <form:input path="firstName"/><br/>
		Last Name : <form:input path="lastName"/><br/>
		Country : <form:select path="country">
			<form:option value="IND" label="India"/>
			<form:option value="US" label="America"/>
			<form:option value="SL" label="Sri Lanka"/>
			<form:option value="AUS" label="Australia"/>
		</form:select><br/>
		Favorite Language : <form:radiobuttons path="favLanguage" items="${student.languageList}"/>
		<input type="submit" value="Click">
	</form:form>
</body>
</html>