<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문 입력 페이지</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<link rel="stylesheet" href="/clsProj/css/user.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<script type="text/javascript" src="/clsProj/js/survey.js"></script>
<style>
</style>
<script type="text/javascript">
	$(function(){
		$('.frm2').css('display', 'none');
	});
</script>
</head>
<body>
	<div class="w3-content mxw">
		<h2 class="w3-amber w3-card w3-padding w3-center w3-margin-bottom">설문 정보 입력</h2>
		<form method="POST" action="/clsProj/survey/surveyInfoProc.cls" class="w3-col w3-card w3-padding frm1" id="frm1">
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="title"><h5 class="w3-text-gray">설문 주제 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="title" name="title">
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="start"><h5 class="w3-text-gray">설문 시작 시간 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="date" id="start" name="start">
					<!-- <input class="w3-input w3-half w3-border" type="time" id="sTime" name="sTime"> -->
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="end"><h5 class="w3-text-gray">설문 종료 시간 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="date" id="end" name="end">
				</div>
			</div>
		</form>
		<div class="w3-col w3-card w3-margin-top frm1">
			<div class="w3-half w3-green w3-hover-lime w3-button" id="hbtn">Home</div>
			<div class="w3-half w3-blue w3-hover-aqua w3-button" id="addIbtn">설문정보등록</div>
		</div>
		<!-- 설문 문항 등록 -->
		<h4 class="w3-center w3-lime w3-padding w3-margin-bottom w3-card frm2" id="">* ${TITLE}</h4> 
		<form method="POST" action="/clsProj/survey/surveyInfoProc.cls" class="w3-col w3-card w3-padding frm2" id="frm2">
			<input type="hidden" name="sino" id="sino">
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="sq"><h5 class="w3-text-gray">설문 문항 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="sq" name="sq">
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="sa1"><h5 class="w3-text-gray">보기 1 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="sa1" name="sa1">
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="sa2"><h5 class="w3-text-gray">보기 2 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="sa2" name="sa2">
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="sa2"><h5 class="w3-text-gray">보기 3 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="sa3" name="sa3">
				</div>
			</div>
			<div class="w3-row">
				<label class="w3-col w-150 w3-right-align" for="sa2"><h5 class="w3-text-gray">보기 4 : </h5></label>
				<div class="w3-rest pd-left-10">
					<input class="w3-input w3-border" type="text" id="sa4" name="sa4">
				</div>
			</div>
		</form>
		<div class="w3-col w3-card w3-margin-top frm2">
			<div class="w3-half w3-green w3-hover-lime w3-button" id="hbtn">Home</div>
			<div class="w3-half w3-blue w3-hover-aqua w3-button" id="addQA">설문정보등록</div>
		</div>
	</div>
</body>
</html>