<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원리스트</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
	$(function(){
		$('.btn').click(function(){
			var tid = $(this).attr('id');
			var url = ' ';
			if(tid == 'logout'){
				url = '/clsProj/member/logoutProc.cls';
				$(location).attr('href', url);
			} else if(tid == 'login'){
				url = '/clsProj/member/login.cls';
				$(location).attr('href', url);
			} else {
				$('#id').val(tid);
				$('#frm').submit();
//				$("#div").show();
			} 
			
//			
			/*
			else if(tid == '${info.id}'){
				$(this).attr('id').val();
			}
			*/
			
				/*
		 $.ajax({
	            type : "GET", 
	            url : "/clsProj/member/memberDetail.jsp",
	            dataType : "html",
	            error : function(){
	                alert("통신실패");
	            },
	            success : function(){
	                $("#div").html(); //div에 받아온 값을 넣는다.
	                alert("통신 데이터 값 : " + data);
	            }
	             
	        });
				*/
		});
		
	});
</script>
</head>
<body>
	<form id="frm" method="post" action="/clsProj/member/memberDetail.cls">
		<input type="hidden" id="id" name="id">
	</form>
	<div style="background-color:orange; text-align: center; height: 100px; padding-top: 20px; margin: 20px;"><h3><b>회원리스트</b></h3></div>
		<c:if test="${not empty SID}">
			<div> 
			<input class="btn w3-purple" type="button" value="Logout" id="logout" style="position:absolute; right: 20px;">
			</div>
			<br>
				<div style="margin: 30px; display:line; position:absolute; right: 40%;">
	 				<c:forEach var="info" items="${LIST}" varStatus="status">	
							<span style="margin: 20px;">
								<div class="w3-col m2 w3-button btn" id="${info.id}" style="background-color: ${COLOR[status.index]}">${info.id}</div>
							</span>
					</c:forEach>
				</div>
			</c:if>
			<br>
			<div id="div"></div>
		<c:if test="${empty SID}">
			<input class="btn" type="button" value="Login" id="login" style="background-color: yellow; position:absolute; right: 20px;">
		</c:if>
</body>
</html>