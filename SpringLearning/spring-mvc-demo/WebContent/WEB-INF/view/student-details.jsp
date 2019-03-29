<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<h2>See the student details listed below:</h2>

Name: ${student.firstName} ${student.lastName}
<br>
Country: ${student.country}
<br>
Favorite Language: ${student.favLanguage}
<br>
ZipCode: ${student.zipCode}
</body>
</html>