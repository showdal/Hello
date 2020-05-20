<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세 정보</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
</script>
</head>
<body>
	<div style="background-color:orange; text-align: center; height: 100px; padding-top: 20px; margin: 20px;"><h3><b>회원 상세 정보</b></h3></div>
	<div>
			<div> 
				<input class="btn w3-purple" type="button" value="Logout" id="logout" style="position:absolute; right: 20px;">
			</div>
			<br>
			<div style="text-align: center; border: 1px solid gray; margin: 20px;">
			<!-- vo -->
			
				<div><h3 style="text-align: center;"><b>${ID}님의 정보</b></h3></div>
				<div><h4>회원번호 : ${VO.mno}</h4></div>
				<div><h4>아이디 : ${VO.id}</h4></div>
				<div><h4>이름 : ${VO.name}</h4></div>
				<div><h4>이메일 : ${VO.mail}</h4></div>
				<div><h4>전화번호 : ${VO.tel}</h4></div>
				<div><h4>성별 : ${VO.gen}</h4></div>
			</div>
	</div>
</body>
</html>