<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 젠더에 성별 이미지, 비밀번호 이벤트  -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join </title>
<link rel="stylesheet" href="../css/w3.css" />
<script type="text/javascript" src="../js/jquery-3.5.0.min.js"></script>
<style>

.ttlim {
	display: inline-block;
	width: 117px;
}

.inputfrgen {
	display: inline-block;
	width: 500px;
	margin-left: 100px;
	margin-top: 0px;
	padding: 0px;
}

.imgnon1 {
		display: none;
	}
	
.imgnon2 {
		display: none;
	}
	
.imggen {
	display: inline-block;
	width: 150px;
	height: 110px;
	margin-right: 5px;
}

.hid {
	display: none;
}

.radio {
	margin-right: 40px;
	margin-left:73px;
	height: 20px;
	width: 20px;
}

</style>
</head>
<body>
	<div class="w3-col l3 m3"><p></p></div>
	<div class="w3-col l6 m6 s12">
		<form class="w3-col" method="post" action="" name="frm" id="frm">
			<div class="w3-col w3-padding w3-margin-top" style="border-top: 2px solid purple; border-bottom: 2px solid purple;">
				<h4>프로필입력</h4>
			</div>
			<div class="w3-col w3-padding w3-border-bottom w3-margin-top">
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="id">I D : </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col m9" type="text" id="id" name="id">
						<input class="w3-col m3 w3-purple w3-round" type="button" id="idck" name="idck" value="check">
					</div>
				<span class="w3-col m12 w3-center" style="font-size: 8pt; color: red;">※5글자 이상 8글자 이하 영문자와 숫자로만 구성</span>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="pw">P W : </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="password" id="pw" name="pw">
					</div>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="repw">Confirm : </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="password" id="repw" name="repw">
					</div>
				</div>
				<div class="w3-col w3-center">
				<span id="pwmsg" class="w3-col m12 w3-center" style="font-size: 8pt; color: red;" ></span>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="name">Name: </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="text" id="name" name="uname">
					</div>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="mail">Mail : </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="text" id="mail" name="mail">
					</div>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="phone">Phone : </label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="text" id="phone" name="phone">
					</div>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="profile">Profile</label>
					<div class="w3-col m9 w3-padding">
						<input class="w3-col" type="file" id="profile" name="profile">
					</div>
				</div>
				<div class="w3-row">
					<label class="w3-col m3 w3-right-align w3-padding" for="gen">Gender: </label>
 					<div class="w3-col m9 w3-padding">
 						<div>
 							<input type="radio" value="F" id="f" name="gen">
 						<label for="f">F</label>
 							<input type="radio" value="M" id="m" name="gen">
 						<label for="m">M</label>
 						</div>
					</div>
					<div>
						<label class="ttlim w3-col m3 w3-right-align w3-padding"></label>
					<div class="inputfrgen">
						<div class="w3-row imgnon1" id="fem"><p></p>
							<img class="w3-col imggen" id="img6" src="/clsProj/img/img_avatar4.png" alt="Image">
							<img class="w3-col imggen" id="img7" src="/clsProj/img/img_avatar5.png" alt="Image">
							<img class="w3-col imggen" id="img8" src="/clsProj/img/img_avatar6.png" alt="Image">
							<div class="w3-row"><p></p></div>
							<input type="radio" name="avt" class="radio">
							<input type="radio" name="avt" class="radio">
							<input type="radio" name="avt" class="radio">
						</div>
						<div class="w3-row imgnon2" id="mal"><p></p>
							<img class="w3-col imggen" id="img1" src="../../img/img_avatar1.png" alt="Image">
							<img class="w3-col imggen" id="img2" src="../../img/img_avatar2.png" alt="Image">
							<img class="w3-col imggen" id="img3" src="../../img/img_avatar3.png" alt="Image">
							<div class="w3-row"><p></p></div>
							<input type="radio" name="avt" class="radio">
							<input type="radio" name="avt" class="radio">
							<input type="radio" name="avt" class="radio">
						</div>
						</div>
					</div>
				</div>
				<div>
			<label for="birth" class="w3-col m3 w3-right-align w3-padding" style="margin-right: 15px">Birth : </label>
			<div class="w3-padding">
				<select>
					<option value="#">년도
					<option value="2020">2020
					<option value="2019">2019
					<option value="2018">2018
					<option value="2017">2017
					<option value="2016">2016
					<option value="2016">2015
					<option value="2016">2014
					<option value="2016">2013
					<option value="2016">2012
					<option value="2016">2011
					<option value="2016">2010
					<option value="2016">2009
					<option value="2016">2008
					<option value="2016">2007
					<option value="2016">2006
					<option value="2016">2005
					<option value="2016">2004
					<option value="2016">2003
					<option value="2016">2002
					<option value="2016">2001
					<option value="2016">2000
					<option value="2016">1999
					<option value="2016">1998
					<option value="2016">1997
					<option value="1996">1996
					<option value="1995">1995
					<option value="1994">1994
					<option value="1993">1993
					<option value="1992">1992
					<option value="1991">1991
					<option value="1990">1990
				</select> 
				<select>
					<option value="#"> 월
					<option value="1"> 1
					<option value="2"> 2
					<option value="3"> 3
					<option value="4"> 4
					<option value="5"> 5
					<option value="6"> 6
					<option value="7"> 7
					<option value="8"> 8
					<option value="9"> 9
					<option value="10"> 10
					<option value="11"> 11
					<option value="12"> 12
				</select>  
				<select>
					<option value="#"> 일
					<option value="1"> 1
					<option value="2"> 2
					<option value="3"> 3
					<option value="4"> 4
					<option value="5"> 5
					<option value="6"> 6
					<option value="7"> 7
					<option value="8"> 8
					<option value="9"> 9
					<option value="10">10
					<option value="11">11
					<option value="12">12
					<option value="13">13
					<option value="14">14
					<option value="15">15
					<option value="16">16
					<option value="17">17
					<option value="18">18
					<option value="19">19
					<option value="20">20
					<option value="21">21
					<option value="22">22
					<option value="23">23
					<option value="24">24
					<option value="25">25
					<option value="26">26
					<option value="27">27
					<option value="28">28
					<option value="29">29
					<option value="30">30
					<option value="31">31
				</select> 
			</div>
			</div>
			<br>
			<div>
			<input type="button" id="submit" value="가입" class="w3-right w3-purple w3-round">
		</div>
		</form>
	</div>
</body>
<script type="text/javascript">
//5글자 이상 8글자 이하 영문자와 숫자로만 구성
function idc(id){
	var reg = /^[A-Za-z0-9]{4,7}$/;
	var ok = reg.test(id);
	return ok;
}

document.getElementById('idck').onclick = function(){
	var id = document.getElementById('id').value;
	var idok = idc(id);
	
	if(!idok){
		alert('아이디를 다시 확인해주세요.');
		document.getElementById('id').value='';
		document.getElementById('id').focus();
		return;
	}
}


document.getElementById('f').onclick = function() {
	if(f.checked) {
		document.getElementById('fem').classList.remove('imgnon1');
		document.getElementById('mal').classList.add('imgnon2');
	}
}


document.getElementById('m').onclick = function() {
	if(m.checked) {
		document.getElementById('mal').classList.remove('imgnon2');
		document.getElementById('fem').classList.add('imgnon1');
	}
}	
$(document).ready(function(){
	$('#repw').focusout(function(){
		var pw1 = $('#pw').val();
		var pw2 = $('#repw').val();
		
		if(pw1 == pw2){
			$('#pwmsg').text('*** 비밀번호가 같습니다. ***');
		} else {
			$('#pwmsg').text('*** 비밀번호가 다릅니다. ***');
		}
	});
	/* 
	$('#submit').click(function(){
		var str = 
	});
	 */
});
</script>
</html>