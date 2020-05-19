<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/w3.css" >
<%
	int num = 1;
%>
</head>
<body>
<div>
	<div class="w3-col l3 m3 s12 w3-blue w3-button">menu<%=num++ %></div>
	<div class="w3-col l3 m3 s12 w3-indigo w3-button">menu<%=num++ %></div>
	<div class="w3-col l3 m3 s12 w3-purple w3-button">menu<%=num++ %></div>
</div>
</body>
</html>