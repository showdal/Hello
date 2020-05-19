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
	<div class="w3-content w3-center mxw2">
		<c:forEach var="dan" begin="2" end="9">
		<div class="w-200 inblock w3-margin w3-card-4">
			<h3 class="w3-padding w3-center ${LIST.get(dan-2)}" style="margin-top: 0px;">- ${dan} 단 -</h3>
			<div class="w3-center w3-padding">
				<c:forEach var="no" begin="1" end="9">
					<h4 class="w3-center">${dan} x ${no} = ${dan*no}</h4>
				</c:forEach>
			</div>
		</div>
		</c:forEach>
		
		<!--
			컨트롤러에서 넘어온 LIST 데이터 하나씩 꺼내서 사용하기
		-->
		<c:forEach var="color" items="${LIST}">
			<div class="w3-margin w3-button w-200 ${color}">button</div>
		</c:forEach>
	</div>
</body>
</html>