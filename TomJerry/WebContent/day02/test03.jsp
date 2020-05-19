<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugu dan</title>
<link rel="stylesheet" href="../css/w3.css">
<style type="text/css">
	body {
		text-align: center;
	}
	.gbox {
		display: inline-block;
		width: 150px;
	}
	
	.mt0 {
		margin-top: 20px;
	}
	
</style>
</head>
<body>
	<%
		ArrayList<String> clist = new ArrayList<String>();
		clist.add("w3-pink");	
		clist.add("w3-purple");
		clist.add("w3-deep-purple");
		clist.add("w3-indigo");
		clist.add("w3-blue");
		clist.add("w3-light-blue");
		clist.add("w3-cyan");
		clist.add("w3-aqua");
		ArrayList<Integer> dan = new ArrayList<Integer>();
		
		for(int i = 0 ; i < 8 ; i++ ){
			dan.add(i+2);
		}
		
		for(int i = 0 ; i < dan.size() ; i++ ){
	%>
	<div class="gbox w3-card w3-center">
	
		<h4 class="<%=clist.get(i)%> w3-padding mt0">- <%=dan.get(i) %> 단 -</h4>
		<div class="w3-padding">
			<%
				for(int gop = 0 ; gop < 9 ; gop++ ){
			%>
			<h6><%=dan.get(i) %> x <%=gop+1 %> = <%=dan.get(i)*(gop+1) %></h6>
			<%
				}
			%>
		</div>
	</div>
	<%
		}
	%>
</body>
</html>