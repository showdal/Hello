<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>설문결과 페이지</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<link rel="stylesheet" href="/clsProj/css/user.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<script type="text/javascript" src="/clsProj/js/survey.js"></script>
<style>
</style>
<script type="text/javascript">
	alert('${LIST.get(0).sq}');
</script>
</head>
<body>
	<div class="w3-content mxw">
		<h2 class="w3-card w3-center w3-padding w3-teal w3-margin-top w3-margin-bottom">설문 결과보기</h2>
		<div class="w3-col w3-border w3-card">
			<h4 class="w3-center">${TITLE}</h4>
		</div>
		<div class="w3-col w3-border w3-card w3-margin-bottom pb-50" >
		
			<div>
				<c:forEach var="data" items="${LIST}" varStatus="st">
					<!-- 설문 문항 -->
					<h6 class="pd-left-20 w3-margin-top w3-margin-bottom" >
						${st.count}. ${data.sq}
					</h6>
					
					<!-- 설문 보기 -->
					<div class="w3-row">
						<div class="w3-col w-100 w3-center">
							<h3>보기 1</h3>
							<h3 class="w3-text-blue">${data.sack1 * 100 / data.saTotal} %</h3>
						</div>
						<div class="w3-rest">
							<div class="pd-left-80" >
								<h5 class="pd-left-10">${data.sa1}</h5>
								<div class="w3-col pd-left-10">
									<div class="w3-orange" style="width: ${data.sack1 * 100 / data.saTotal}%; height: 30px;"><p></p></div>
								</div>
							</div>
						</div>
					</div>
					<div class="w3-row">
						<div class="w3-col w-100 w3-center">
							<h3>보기 2</h3>
							<h3 class="w3-text-blue">${data.sack2 * 100 / data.saTotal} %</h3>
						</div>
						<div class="w3-rest">
							<div class="pd-left-80" >
								<h5 class="pd-left-10">${data.sa2}</h5>
								<div class="w3-col pd-left-10">
									<div class="w3-orange" style="width: ${data.sack2 * 100 / data.saTotal}%; height: 30px;"><p></p></div>
								</div>
							</div>
						</div>
					</div>
					<div class="w3-row">
						<div class="w3-col w-100 w3-center">
							<h3>보기 3</h3>
							<h3 class="w3-text-blue">${data.sack3 * 100 / data.saTotal} %</h3>
						</div>
						<div class="w3-rest">
							<div class="pd-left-80" >
								<h5 class="pd-left-10">${data.sa3}</h5>
								<div class="w3-col pd-left-10">
									<div class="w3-orange" style="width: ${data.sack3 * 100 / data.saTotal}%; height: 30px;"><p></p></div>
								</div>
							</div>
						</div>
					</div>
					<div class="w3-row">
						<div class="w3-col w-100 w3-center">
							<h3>보기 4</h3>
							<h3 class="w3-text-blue">${data.sack4 * 100 / data.saTotal} %</h3>
						</div>
						<div class="w3-rest">
							<div class="pd-left-80" >
								<h5 class="pd-left-10">${data.sa4}</h5>
								<div class="w3-col pd-left-10">
									<div class="w3-orange" style="width: ${data.sack4 * 100 / data.saTotal}%; height: 30px;"><p></p></div>
								</div>
							</div>
						</div>
					</div>
					
				</c:forEach>
			</div>
		</div>
		<div class="w3-col w3-border w3-card">
			<div class="w3-button w3-half w3-orange" id="hbtn">home</div>
			<div class="w3-button w3-half w3-amber" id="bbtn">보류</div>
		</div>
	</div>
</body>
</html>