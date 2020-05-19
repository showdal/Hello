<%@ page language="java" contentType="text/html; charset=UTF-8" 
		pageEncoding="UTF-8" errorPage="err02_01.jsp" %>
<%@ page info="이 페이지는 에러페이지 테스트용 jsp 페이지..." %>
<!DOCTYPE html>
<html>
<%
	Integer.parseInt("abc");
%>
<head>
<meta charset="UTF-8">
<title>Error Page Test</title>
<link rel="stylesheet" href="../css/w3.css">
</head>
<body>
	<h1 class="w3-padding w3-center w3-blue">여기는 test02.jsp</h1>
</body>
</html>