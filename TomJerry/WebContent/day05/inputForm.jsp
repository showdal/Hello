<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input Form</title>
<link rel="stylesheet" href="../css/w3.css">
<link rel="stylesheet" href="../css/user.css">
<script type="text/javascript" src="../js/jquery-3.5.0.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$('#get').click(function() {
			var sid = $('#id').val();
			if(!sid){
				$('#id').focus();
				return;
			}
			$('#frm').submit();
		});
	});
</script>
</head>
<body>
	<div class="w3-content mxw h-100">
		<div class="w3-display-container h-100" >
			<div class="w3-display-middle w3-padding w3-card">
				<label for="id" class="w3-col m3  w3-rigth-align w3-padding">I D : </label>
				<form class="w3-col m9 w3-padding" id="frm" method="POST" action="./MembInfo.cls2">
					<input type="text" id="id" name="id">
				</form>
				 <div class="w3-col">
				 	<div class="w3-half w3-button w3-red" id="home">Home</div>
				 	<div class="w3-half w3-button w3-blue" id="get">Get Info</div>
				 </div>
			</div>
		</div>
	</div>
</body>
</html>