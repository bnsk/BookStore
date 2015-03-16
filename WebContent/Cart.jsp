
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
	"http://www.w3.org/TR/html4/loose.dtd">
	<%@page import="java.util.HashMap"%>
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cart</title>
 </head>
<body bgcolor="cornflowerblue">

<%double amount;%>
<%double total_amount=0; %>
<table border='1'>
<marquee behavior="scroll" direction="right">YOUR-CART:..</marquee>
 <tr valign="top">
 <td>${"BookName"}</td>
<td>${"quantity"}</td>
<td>${"price"}</td>
</tr>
<c:forEach var="i" items ="${selectcodes}">
	<tr valign="top">
	
	<td>${prodHashmap[i].bookname}</td> 
	<td>${bookqty[i]}</td>
	<td>${bookqty[i]*prodHashmap[i].price}</td></tr>
	

	
</c:forEach>


<td>TOTAL:-${Grandtotal1}</td>
</table>
<p>If you want to remove a book,go to previous page,check the corresponding book and make the quantity '0'</p>	
<br>
<a href="/BookStore/ProductServlet">CART</a>
			<br>
			<a href="/BookStore/Searchresult.jsp">SearchString-result</a>
            <br>
			<a href="/BookStore/welcome.html">HOME</a><br>
<a href="/BookStore/display.jsp">BOOK-LIST and SEARCH</a>
<br><a href="/BookStore/Confirmation">Confirm-order</a>
<br><a href="/BookStore/display.jsp">To change-GOBACK</a>
</body>
</html>
