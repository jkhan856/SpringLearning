<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student registration</title>

</head>
<body>
	<form:form action = "details" modelAttribute = "student">
		First Name*: <form:input path="firstName"/>
		<form:errors path="firstName" cssClass = "error" />
		<br>
		Last Name: <form:input path="lastName"/>
		<form:errors path="lastName" cssClass = "error" />
		<br>
		Country:
		  <form:select path="country">
              <form:option value="BRZ" label="Brazil"/>
              <form:option value="FRN" label="France"/>
              <form:option value="DE" label="Germany"/>
              <form:option value="IND" label="India"/>
          </form:select>
      	<br>
		Select your favourite language:
		<br>
		Java <form:radiobutton path="favLanguage" value = "Java"/>
		Python <form:radiobutton path="favLanguage" value = "Python"/>
		Ruby <form:radiobutton path="favLanguage" value = "Ruby"/>
		C# <form:radiobutton path="favLanguage" value = "C#"/>
		<br>
		
		Zip Code: <form:input path="zipCode"/>
		<form:errors path="zipCode" cssClass = "error" />
		<br>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>