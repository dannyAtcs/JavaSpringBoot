<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing Page</title>
</head>
<body>
<h1> Welcome To Landing Page</h1>



<%=request.getAttribute("key1") %>

<% String age =(String)request.getAttribute("key2");
out.println(age);
%>


</body>
</html>