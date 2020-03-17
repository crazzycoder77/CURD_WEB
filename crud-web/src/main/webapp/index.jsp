<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<html>
<body>
<h2>CRUD APPLICATION</h2>
<a href="insert.jsp">Insert</a>
<br/>
<a href="update.jsp">Update</a>
<br/>
<a href="delete.jsp">Delete</a>
<br/>
<a href="EmployeeController?action=getAll">GetAll</a>
<br/>
<c:out value="${status}" />
</body>
</html>
