<<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><center><b>SURVEY</b></center></title>
</head>
<body bgcolor="khaki">
<center><b>SURVEY</b></center>
<h3><b>Your Information:</b></h3>
<%@ page import="beans.SimpleBean" %>
<form action="/BookStore/BookForward">
      <table border="0" cellpadding="2" cellspacing="2"
 width="100%">
 <%SimpleBean sb=(SimpleBean)session.getAttribute("bean");%>

 <tr>
 <td> First Name:</td>
 <td><%=sb.getfName() %> </td>
</tr>
<tr>
 <td>Last Name: </td>
 <td> <%=sb.getlName() %></td>
</tr>
<tr>
 <td>Email: </td>
 <td> <%=sb.geteMail() %></td>
</tr>
<tr>
 <td>Address: </td>
 <td> <%=sb.getaddress() %></td>
</tr>
</table>
<h3><b>How did you hear about us?</b></h3>
 <!--  <input type="radio" name="radiobutton" value="myValue1">
Web
<input type="radio" name="radiobutton" value="myValue2" checked>
Television
<input type="radio" name="radiobutton" value="myValue3" checked>
Other-->
<td>${bean.heardBy}</td>
<h3><b>I am interested in these types of music:</b></h3>
<!-- <input type="checkbox" name="selection1">Classical
<input type="checkbox" name="selection2">Devotional	
<input type="checkbox" name="selection3">Metallic
<input type="checkbox" name="selection4">Rock
-->
<td><%=sb.isClassicalCb() ?"Classical<br>":""  %></td>
<td><%=sb.isDevotionalCb() ?"Devotional<br>":""  %></td>
<td><%=sb.isMetallicCb() ?"Metallic<br>":""  %></td>
<td><%=sb.isRockCb() ?"Rock<br>":""  %></td>

<h3><b>Please contact me by:</b></h3>
<!-- <select name="select">
<option value="email">Email</option>
<option value="phone">Phone</option>
<option value="post">Post</option>
</select>
-->
<td><%=sb.getContactMe() %></td>
<br>
<br>
<center><input type="submit" name="Submit" value="Submit">
</center>
</form>
<a href="/BookStore/ProductServlet">CART</a>
			<br>
			<a href="/BookStore/Searchresult.jsp">Search-result</a>
            <br>
			<a href="/BookStore/welcome.html">HOME</a><br>
<a href="/BookStore/Survey.html">To Change-GOBACK</a><br>
<a href="/BookStore/Confirmation">Confirm-Order</a>
</body>
</html>