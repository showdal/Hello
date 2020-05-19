<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Test</title>
<link rel="stylesheet" href="../css/w3.css">
<link rel="stylesheet" href="../css/user.css">
</head>
<%
	String sid = (String)session.getAttribute("SID");
	String pid = request.getParameter("id");
	String ppw = request.getParameter("pw");
	String pjob = request.getParameter("job");
	String ptel = request.getParameter("tel");
	String pmail = request.getParameter("mail");
%>
<body>
	<div class="w3-content mxw">
		<h2 class="w3-padding w3-card-4 w3-margin-top w3-purple w3-center">Test02.jsp</h2>
		<div class="w3-col w3-padding w3-card-4 w3-margin-top w3-round-large w3-border w3-border-amber">
			<div class="w3-col">
				<h3 class="w3-col m3 w3-right-align w3-padding">I D : </h3>
				<h3 class="w3-col m8 w3-padding"><%=pid %></h3>
			</div>
			<div class="w3-col">
				<h3 class="w3-col m3 w3-right-align w3-padding"">P W : </h3>
				<h3 class="w3-col m8 w3-padding""><%=ppw %></h3>
			</div>
			<div class="w3-col">
				<h4 class="w3-col m3 w3-right-align w3-padding">JOB : </h4>
				<h4 class="w3-col m8 w3-padding"><%=pjob %></h4>
			</div>
			<div class="w3-col">
				<h4 class="w3-col m3 w3-right-align w3-padding">TEL : </h4>
				<h4 class="w3-col m8 w3-padding"><%=ptel %></h4>
			</div>
			<div class="w3-col">
				<h4 class="w3-col m3 w3-right-align w3-padding">MAIL : </h4>
				<h4 class="w3-col m8 w3-padding"><%=pmail %></h4>
			</div>
			<div class="w3-col">
				<h3 class="w3-col m3 w3-right-align w3-padding">SID : </h3>
				<h3 class="w3-col m8 w3-padding"><%=sid %></h3>
			</div>
		</div>
	</div>
</body>
</html>