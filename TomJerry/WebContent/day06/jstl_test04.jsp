<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<link rel="stylesheet" href="/TomJerry/css/w3.css">
<link rel="stylesheet" href="/TomJerry/css/user.css">
<script type="text/javascript" src="/TomJerry/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">

</script>
</head>
<body>
	<div class="w3-content mxw2">
		<div class="w3-col w3-card-4 w3-padding">
			<div class="w3-col">
				<label for="id" class="w3-col m2 w3-right-align w3-padding">I D : </label>
				<h3 class="w3-col m10 w3-padding" id="id">${param.id}</h3>
			</div>
			<div class="w3-col">
				<label for="name" class="w3-col m2 w3-right-align w3-padding">NAME : </label>
				<h3 class="w3-col m10 w3-padding" id="name">${param.name}</h3>
			</div>
			<div class="w3-col">
				<label for="tel" class="w3-col m2 w3-right-align w3-padding">TEL : </label>
				<h3 class="w3-col m10 w3-padding" id="tel">${param.tel}</h3>
			</div>
			<div class="w3-col">
				<label for="mail" class="w3-col m2 w3-right-align w3-padding">MAIL : </label>
				<h3 class="w3-col m10 w3-padding" id="mail">${param.mail}</h3>
			</div>
		</div>
	</div>
</body>
</html>