<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Student Registration Form</title>
</head>
<body>
	<form:form action="processRegistrationForm" modelAttribute="student">
	First Name: <form:input path="firstName" />
		<br>
	Last Name: <form:input path="lastName" />
		<br>
	Country: <form:select path="country">
			<form:options items="${fileCountryOptions}" />
		</form:select>
		<br>
		Language: 
	<!--  	Java <form:radiobutton path="favouriteLanguage" value="Java"/>
		Ruby <form:radiobutton path="favouriteLanguage" value="Ruby"/>
		C# <form:radiobutton path="favouriteLanguage" value="C#"/>
	-->
		<form:radiobuttons path="favouriteLanguage"
			items="${student.favouriteLanguageOptions}" />
		<br>
		
		Operating Systems
		Java <form:checkbox path="operatingSystems" value="Java" />
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS" />
		Linux <form:checkbox path="operatingSystems" value="Linux" />
		<br>

		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>