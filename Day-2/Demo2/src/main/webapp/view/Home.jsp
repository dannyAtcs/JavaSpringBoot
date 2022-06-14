<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.atcs.demo1.model.Employee" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
</head>
<body>

<h1>  Welcome to Landing Page</h1>

<% Employee e =(Employee) request.getAttribute("employee");

  out.println(e.getName());
  out.println(e.getId());
  out.println(e.getSalary());

%>

</body>
</html>