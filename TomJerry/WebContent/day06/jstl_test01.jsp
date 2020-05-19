<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Test01</title>
<link rel="stylesheet" href="/TomJerry/css/w3.css">
<link rel="stylesheet" href="/TomJerry/css/user.css">
</head>
<body>
	
	<div class="w3-content w3-center">
		<c:forEach var="num" begin="2" end="5">
			<c:forEach var="no" begin="1" end="10" step="2">
				<div class="w3-col m2 w3-button w3-margin w3-blue">Button ${no}</div>
			</c:forEach>	
		</c:forEach>
	</div>
</body>
</html>