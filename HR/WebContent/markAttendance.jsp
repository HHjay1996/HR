<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="markAttendance">
	<table>
	<tr><td>UserName:</td><td><input type="text" name="name"></td></tr>
	<tr><td>eid:</td><td><input type="text" name="eid"></td></tr>
	<tr><td>date:</td><td><input type="date" name="date"></td></tr>
	<tr><td>workHrsPerDay:</td><td><input type="text" name="workHrs"></td></tr>
	<tr><td><input type="submit" name="submit" value="login"></td><td><a href="register.jsp">Registration</</a></td></tr>
	</table>
	
	</form>

</body>
</html>