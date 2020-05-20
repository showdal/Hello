<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>방명록 작성</title>
<link rel="stylesheet" href="/clsProj/css/w3.css">
<link rel="stylesheet" href="/clsProj/css/user.css">
<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
<style>
</style>
<script type="text/javascript">
	$(document).ready(function(){
		$('#sbtn').click(function(){
			var str = $('#body').val();
			// 로그인이 안된 경우는 로그인 폼으로 보낸다.
			if('${SID eq null}'){
				alert('로그인 창으로 이동합니다. 얄루~');
				$(location).attr('href','/clsProj/member/login.cls');
			}
			if(!str || str.length > 50){
				// 입력내용이 없거나 입력내용의 길이가 50자를 넘어가면 다시 입력하게 한다.
				$('#body').val(str.substr(0, 50));
				return;
			} 
			$('#frm').submit();
		});
	});
</script>
</head>
<body>
   <div class="w3-content mxw">
      <div class="w3-col">
         <h2 class="w3-indigo w3-center w3-card">방명록 작성</h2>
         <div class="w3-col w3-padding w3-card">
            <div class="w3-col  w3-margin-top">
               <label for="id" class="w3-col m2" style="display: inline-block; padding-top: 3px;"><h5><b>아이디 : </b></h5></label>
               <h6 class="w3-col m8 w3-text-grey" style="margin:0px; padding-top:15px;" id="id"><b>${SID}</b></h6>
            </div>
            <form class="w3-col w3-margin-bottom" method="post" action="/gBoard/gBoardProc.cls" id="frm">
            	<input type="hidden" id="sid" name="id" value="${SID}">
               <label for="id" class="w3-col"><h5><b>글내용 : </b></h5></label>
               <textarea class="w3-col w3-border" name="body" id="body" cols="50" rows="5" style="resize: none;" placeholder="내용"></textarea>
            </form>
         </div>
            <div class="w3-col w3-margin-top w3-card">
               <div class="w3-half w3-button w3-red w3-hover-pink" id="hbtn">home</div>
               <div class="w3-half w3-button w3-blue w3-hover-purple" id="sbtn">submit</div>
            </div>
      </div>
   </div>
</body>
</html>