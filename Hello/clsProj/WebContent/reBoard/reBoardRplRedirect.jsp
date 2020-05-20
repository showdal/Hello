<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReBoard Reply Redirect</title>
<link rel="stylesheet" href="/css/w3.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
	$(function(){
		$('#frm').submit();
	});
</script>
</head>
<body>
	<%-- 
	GET 방식
	<c:redirect url="/reBoard/reBoard.cls">
		<c:param name="nowPage" value="${param.nowPage}" />
	</c:redirect>
	 --%>
	 
	<%-- POST 방식 --%>
	<form method="post" action="/clsProj/reBoard/reBoard.cls" id="frm">
		<input type="hidden" name="nowPage" value="${param.nowPage}">
		<input type="hidden" name="upno" value="${param.upno}">
	</form>
</body>
</html>