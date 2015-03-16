<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register here;</h1>
<p>To register,please fill in the details and click on the submit button.</p>
<form action="<%= response.encodeURL("registerUser")%>"
method="post">

<table cellspacing="5" border="0">
 <tr>
 <td> First Name:</td>
 <td> <input name="Input Name" size="10"></td>
</tr>
<tr>
 <td>Last Name: </td>
 <td> <input name="Last Name"  size="10"></td>
</tr>
<tr>
 <td>Email: </td>
 <td> <input name="Email"  size="15"></td>

</tr>
<br>
<br>
<center><input type="submit" name="Submit" value="Submit">
</center>

</table>
</form>

</body>
</html>