<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Student Confirmation Form</title>
</head>
<body>
The Student is confirmed: ${student.firstName} ${student.lastName}
<br><br>
Country: ${student.country}
<br><br>
Favourite Language: ${student.favouriteLanguage}

<br><br>
Operating Systems:
<ul>
	<c:forEach var="temp" items="${student.operatingSystems}" >
	<li>${temp}</li>
	</c:forEach>
</ul>

</body>
</html>