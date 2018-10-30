<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display name</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/simple-test.css">

<script
	src="${pageContext.request.contextPath}/resources/js/simple-test.js"></script>
</head>
<body>
	Welcome dear ${param.getName}
	<br>
	<br> Yahoo!!! ${message}

	<br>
	<br>

	<img
		src="${pageContext.request.contextPath}/resources/images/simple-test.jpg" />

	<br>
	<br>

	<input type="button" onclick="doSomeWork()" value="Click Me" />
</body>
</html>