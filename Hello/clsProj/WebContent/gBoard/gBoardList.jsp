<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gBoardList</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<link rel="stylesheet" href="/clsProj/css/user.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
	/* $(function(){
		
		$('.btn').click(function(){
			var tid = $(this).attr('id');
			var url = ' ';
			if(tid == 'write'){
				url = '/clsProj/gBoard/gBoardWrite.cls';
			} else if(tid == 'home') {
				url = '/clsProj/main.cls';
			} 
			
			$(location).attr('href', url);
		});
	}); */
	
	$(function(){
		$('#sbtn').click(function(){
			var str = $('#body').val();
			if(!str){
				return;
			}
			$('#frm').submit();
		});
		
		$('#hbtn').click(function(){
			$(location).attr('href', '/clsProj/main.cls');
		});
		
		$('#logout').click(function(){
			$(location).attr('href', '/clsProj/member/logoutProc.cls');
		});
		$('#login').click(function(){
			$(location).attr('href', '/clsProj/member/login.cls');
		});
	});
</script>
</head>
<body>
   <div class="w3-content mxw2">
      <div class="w3-col">
         <h2 class="w3-blue w3-center w3-padding w3-margin-bottom">방명록 리스트</h2>
         <div class="w3-col w3-margin-bottom">
				<c:if test="${empty SID}">
					<div class="w3-col m1 w3-right w3-button w3-tiny w3-blue" id="login">Login</div>
				</c:if>
				<c:if test="${not empty SID}">
					<div class="w3-col m1 w3-right w3-button w3-tiny w3-amber" id="logout">Logout</div>
				</c:if>
				
				<div class="w3-col m1 w3-left w3-button w3-tiny w3-green" id="hbtn">Home</div>
			</div>
        <c:if test="${(CNT ne 1) && (not empty SID)}">
				<form class="w3-col w3-border w3-margin-bottom" id="frm" method="post" action="/clsProj/gBoard/gBoardProc.cls">
					<div class="w3-col w-100 w3-center pd-10">
						<img class="h-80p w-auto w3-circle" src="/clsProj/img/${AVT}">
					</div>
					<div class="w3-rest pdh-10 w3-border-left">
						<div class="w3-col w3-border-bottom pd-5">
							<h5 class="w3-half w3-left-align" style="margin: 0px; padding-left: 10px"><b>${SID}</b></h5>
							<div class="w3-btn w3-padding-small w3-right w3-red" id="sbtn">submit</div>
						</div>
						<div class="w3-col">
							<textarea id="body" name="body" class="w3-padding" cols="58.5" rows="2" style="margin-top: 3px; resize: none;" required></textarea>
						</div>
					</div>
				</form>
			</c:if>
       		 <c:forEach var="vo" items="${LIST}">
				<div class="w3-col w3-border w3-margin-bottom" id="${vo.gno}">
					<div class="w3-col w-100 w3-center pd-10 w3-border-right">
						<img class="h-80p w-auto w3-circle" src="/clsProj/img/${vo.avatar}">
					</div>
					<div class="w3-rest pdh-10">
						<div class="w3-col w3-border-bottom">
							<h5 class="w3-half w3-left-align" style="margin: 0px; padding-left: 10px"><b>${vo.id}</b></h5>
							<h6 class="w3-half w3-right-align w3-text-grey" style="margin: 0px; padding-right: 10px"><small>${vo.sDate}</small></h6>
						</div>
						<div class="w3-col">
							<h6 class="w3-padding">${vo.body}</h6>
						</div>
					</div>
				</div>
				</c:forEach>

		<c:if test="${empty List}">         
         	<div class="w3-col w3-border w3-margin-bottom w3-card-4" id="gmsg">
         		<h3 class="w3-padding w3-center">아직 작성된 글이 없습니다.</h3>
         	</div>
         </c:if>
      </div>
   </div>
</body>
</html>