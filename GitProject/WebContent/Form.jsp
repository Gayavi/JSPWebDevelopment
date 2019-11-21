<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1>Vote Validation Form</h1>
<form action="${ pageContext.request.contextPath}/Validate" method="GET"> First name: <br> 
<input type="text" name="fname"><br> 
Last name: <br> <input type="text" name="lname"><br>
Age:<br> <input type="text" name="age"><br>
Current Citizenship:<br>
<select name="citizen"><option>Srilanka</option><option>India</option><option>Australia</option></select>
<br>
<input type="checkbox" name="multi">I have a multiple citizenship<br>
<input type="submit" value="Submit">
</form>
</body>
</html>