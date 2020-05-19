<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login </title>
<link rel="stylesheet" href="../css/w3.css" />
<script type="text/javascript" src="../js/jquery-3.5.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#lbtn').click(function(){
			// 할일
			// 1. 데이터 읽고
			var sid = $('#id').val();
			var spw = $('#pw').val();
			// 2. 유효성 검사하고
			if(!sid){
				$('#id').focus();
				return;
			}
			if(!spw){
				$('#pw').focus();
				return;
			}
			/*$('frm').attr('method','GET');*/
			$('frm').attr('method','POST');
			$('frm').attr('method','Test01.jsp');
			$('frm').submit();
			
			/*
			// 3. 비동기 통신을 하고
			$.ajax({
				url: 'http://localhost/loginProc.lp',
				type: 'get',
				dataType: 'json',
				data: {
					'id': sid,
					'pw': spw
				},
				success: function(obj){
					var result = obj.SID;
					// 4. 결과에 따라서 뷰를 처리해준다.
					if(result){
						$('#msg').html('[ ' + result + ' ] 회원님은 로그인 상태입니다');
						$('#loginWin').css('display', 'none');
						$('#msgWin').css('display', '');
					} else {
						alert('아이디와 비밀번호를 확인하세요');
						$('#id').val('');
						$('#pw').val('');
						$('#id').focus();
					}
				},
				error: function(){
					alert('통신 에러');
				}
			});
			
		}); 
		$('#hbtn').click(function(){
			$('#id').val('');
			$('#pw').val('');*/
		});
	});
</script>

<style>
	.lbl {
		display: inline-block;
		width: 50px;
		height: 20px;
		text-align: left;
	}
	.input {
		display: inline-block;
		width: 270px;
		height: 30px;
		border: 1px solid lightgray;
		margin-top: 10px;
		margin-left: 0px;
	}
</style>

</head>
<body>
<h2 align="center">Login</h2>
<hr><br>
<div class="w3-center"  id="loginWin">
	<label class="lbl" for="id" style="margin-left: -200px;">I&nbsp;&nbsp;D </label><br><input class="input" type="text" name="id" id="id"></div><br>
<div class="w3-center">
	<label class="lbl" for="pw" style="margin-left: -200px;">P W  </label><br><input class="input" type="password" name="pw" id="pw"></div><br>
	<div class="w3-center">
		<input type="button" id="lbtn" value="&emsp;&emsp; Login &emsp;&emsp;"  style="background-color:lavender; padding:10px; border:0px">
		<input type="button" id="hbtn" value="&emsp;&emsp; Cancel &emsp;&emsp;"  style="background-color:lavender; padding:10px; border:0px">
	</div>
	<div class="w3-third" id="msgWin" style="display: none;">
		<h2 class="w3-col w3-margin-top w3-card-4" 
			style="padding-top: 80px; height: 250px;" id="msg"></h2>
	</div>
</body>
</html>