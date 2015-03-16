<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BookStore</title>

</head>
<body bgcolor="AQUA">

		 <form action="/BookStore/ProductServlet" method="get">
			<table border="1">
<p>Booklist</p>
			
		<%int j=0;%>
			<c:forEach var="i" items="${productcodes}">
				<tr valign="top">
				
					
					<td><input type="checkbox" name="book-<%=j%>" value="${prodHashmap[i].code}"></td>
					<td>${prodHashmap[i].code}</td>
					<td>${prodHashmap[i].bookname}</td>
					<td>${prodHashmap[i].author}</td>
					<td>${prodHashmap[i].price }</td>
					<td>
						 <input type="text" name="qty-<%=j++ %>"
							size="2"></td>
				</tr>
			</c:forEach>
			</table>
	<br>
	<br><b><center><input type="submit" value="Proceed..:)"></center></b>
	</form>
	<form action="/BookStore/SearchServlet" method="get">
	<p>SEARCH:</p>
	<input type="text" name="Search">
	<input type="submit" value="search"></form>
	
<a href="/BookStore/ProductServlet">CART</a>
			<br>
			<a href="/BookStore/Searchresult.jsp">Search-result</a>
            <br>
			<a href="/BookStore/welcome.html">HOME</a><br>
<a href="/BookStore/result1.jsp">BACK</a><br>
<a href="/BookStore/Confirmation">Confirm-Order</a>
	
	</body>
</html>