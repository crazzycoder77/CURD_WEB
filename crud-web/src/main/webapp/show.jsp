<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Report</title>
</head>
<body>
	<h1>EMPLOYEE REPORT</h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Salary</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${employees}" var="emp">
				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.salary}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>