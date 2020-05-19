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
<%
	String sid = (String)request.getAttribute("ID");
	String name = (String)request.getAttribute("NAME");
	String tel = (String)request.getAttribute("TEL");
	String mail = (String)request.getAttribute("MAIL");
%>
<script type="text/javascript">
	$(document).ready(function() {

	});
</script>
</head>
<body>
	<div class="w3-content mxw h-100">
		<div class="w3-display-container h-100">
			<div class="w3-display-middle w3-padding ">
				<div class="w3-col w3-padding w3-card w3-border w3-border-blue w3-round-large">
					<div>
						<label for="id" class="w3-col m4  w3-rigth-align w3-padding">I D : </label>
						<div class="w3-col m8 w3-padding" id="id"><%=sid %></div>
					</div>
					<div>
						<label for="id" class="w3-col m4  w3-rigth-align w3-padding">Name : </label>
						<div class="w3-col m8 w3-padding" id="name"><%=name %></div>
					</div>
					<div>
						<label for="id" class="w3-col m4  w3-rigth-align w3-padding">Tel : </label>
						<div class="w3-col m8 w3-padding" id="tel"><%=tel %></div>
					</div>
					<div>
						<label for="id" class="w3-col m4  w3-rigth-align w3-padding">Mail : </label>
						<div class="w3-col m8 w3-padding" id="mail"><%=mail %></div>
					</div>
					
				</div>
				<div class="w3-col w3-margin-top">
					<div class="w3-half w3-button w3-red" id="home">Home</div>
					<div class="w3-half w3-button w3-blue" id="getId">Goto Id</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>