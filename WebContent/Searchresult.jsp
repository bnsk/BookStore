<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SearchResult</title>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body bgcolor="aqua">
<form action="/BookStore/ProductServlet" method="get">
	<table border="1">
<p>Search result Booklist:<form action="/BookStore/ProductServlet" method="get"></p>
		
		<%int j=0;%>
			<c:forEach var="i" items="${searchmatchcodes}">
				<tr valign="top">
				
					
					 <td><input type="checkbox" name="book-<%=j%>" value="${prodHashmap[i].code}"></td>
					<td>${prodHashmap[i].code}</td>
					<td>${prodHashmap[i].bookname}</td>
					<td>${prodHashmap[i].author}</td>
					<td>${prodHashmap[i].price }</td> 
         <td> <input type="text" name="qty-<%=j++ %>"
							size="2"></td>
				</tr>
			</c:forEach>
			</table>
	<br><b><center><input type="submit" value="Proceed..:)"></center></b>
</form>

			
			<a href="/BookStore/welcome.html">HOME</a><br>
<a href="/BookStore/display.jsp">BACK</a><br>
<a href="/BookStore/Confirmation">Confirm-Order</a>
	
</body>
</html>