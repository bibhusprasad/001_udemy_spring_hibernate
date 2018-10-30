<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome page</title>
<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>CRM : Customer Relationship Manager</h2>
		</div>
		<div id="header1">
			<h3><a href="/crm/">Home</a>       <a href="/crm/">Logout</a></h3>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<h3>Sorry!! System unavailable. Please try after some time.</h3>
		</div>
	</div>

</body>
</html>