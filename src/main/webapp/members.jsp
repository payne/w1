<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>members</title>
</head>
<body>
<h1>members check in here:</h1>
<ol>
<c:forEach var="person" items="${members}">
<li>${person.name}</li>
</c:forEach>
</ol>

</body>
</html>