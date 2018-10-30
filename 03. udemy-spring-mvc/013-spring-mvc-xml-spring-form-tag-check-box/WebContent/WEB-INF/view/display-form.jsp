<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display name</title>
</head>
<body>
Welcome dear ${student.firstName} ${student.lastName} from ${student.country} <br/>
Favorite Language is ${student.favLanguage} <br/>
Operating system :
	<ul>
		<c:forEach var="temp" items="${student.operatingSystem}">
			<li>${temp}</li>
		</c:forEach>
	</ul>
<br>
</body>
</html>