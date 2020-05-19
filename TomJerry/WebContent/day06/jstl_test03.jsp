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
	<c:redirect url="/pre/jtest04.cls2">
		<c:param name="id" value="${id}" />
		<c:param name="name" value="${name}" />
		<c:param name="tel" value="${tel}" />
		<c:param name="mail" value="${mail}" />
	</c:redirect>
</body>
</html>