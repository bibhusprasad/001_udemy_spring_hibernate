<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
	.failed {
		color: red;
	}
</style>
</head>
<body>
	<h3>My Custom login page.</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="post">
		
		<c:if test="${param.error != null}">
			<i class="failed">Sorry !! Invalid user name and password.</i>
		</c:if>
	
		<p>
		User Name: <input type="text" name="username"/> 
		</p>
		<p>
		Password: <input type="password" name="password"/> 
		</p>
		<input type="submit" value="Login">
	</form:form>
</body>
</html>