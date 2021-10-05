<%@page import="com.example.demo.dragon"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%ArrayList<dragon> drgList = (ArrayList<dragon>)request.getAttribute("drgList"); %>
<title>Insert title here</title>
</head>
<body>
	<form action="addDragon">
	    <label for="d_id">Id</label>
	    <input type="text" name="d_id"><br><br>
	    <label for="d_name">Name</label>
	    <input type="text" name="d_name"><br><br>
	    <label for="d_class">Class</label>
	    <input type="text" name="d_class"><br><br>
	    <input type="submit" name="Submit"><br>
	</form>

	<table border=1>
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Class</th>
			</tr>
		</thead>
		<tbody>
			<%for(dragon drg:drgList){%>
			<tr>
				<td><%=drg.getD_id()%></td>
				<td><%=drg.getD_name()%></td>
				<td><%=drg.getD_class()%></td>
			</tr>
			<%}%>
		</tbody>
	</table>
</body>
</html>