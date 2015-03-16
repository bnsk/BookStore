<%@page import="java.util.Iterator"%>
<%@page import="beans.WriteFile"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.io.*"%>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Confirm</title>
</head>
<body bgcolor="chocolate">
<h2>Your books shall be sent to the following address within 15 days:</h2>
<form action="/BookStore/Final" method="get">

<%@ page import="beans.SimpleBean" %>

      
      	<table border="0" cellpadding="2" cellspacing="2"
      		width="100%">
      		
    <%  		SimpleBean sb1=(SimpleBean)session.getAttribute("bean");	
   
%>
      		<tr>
      			<td>First Name:</td>
      			<td>
      				<%=sb1.getfName()%>
      			</td>
      		</tr>
      		<tr>
      			<td>Last Name:</td>
      			<td>
      				<%=sb1.getlName()%>
      			</td>
      		</tr>
      		<tr>
      			<td>Email:</td>
      			<td>
      				<%=sb1.geteMail()%>
      			</td>
      		</tr>
      		<tr>
      			<td>Address:</td>
      			<td>
      				<%=sb1.getaddress()%>
      			</td>
      		</tr>
      	</table>
      </element>

      <h3>Thank YOU...visit again... :)</h3>
      <input type="submit" value="finally done!!">

</form>
</body>
</html>