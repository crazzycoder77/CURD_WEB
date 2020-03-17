<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Details</title>
</head>
<body>
	<h1>Enter Employee Details</h1>
	<form action="EmployeeController" method="get">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" placeholder="Employee Id"
					required="required" /></td>
			</tr>
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" placeholder="Employee Name"
					required="required" /></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><input type="text" name="salary"
					placeholder="Employee Salary" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add" name="save"></td>
				<td><input type="reset" value="Clear" name="reset"> <input
					type="hidden" name="action" value="insert" /></td>
			</tr>
		</table>
	</form>
</body>
</html>