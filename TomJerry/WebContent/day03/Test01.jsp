<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Request Test</title>
<link rel="stylesheet" href="../css/w3.css">
<link rel="stylesheet" href="../css/user.css">
<%
	String pid = request.getParameter("id");
	String ppw = request.getParameter("pw");
	
	if(pid != null && pid.length() != 0){
		session.setAttribute("SID", pid);
	}
	
	// forward
	RequestDispatcher rd = request.getRequestDispatcher("/day03/Test02.jsp");
 	rd.forward(request, response);
/* 	
	// redirect 방식
	response.sendRedirect("Test02.jsp");
 */
 
%>
 <jsp:forward page="/day03/Test03.jsp">
 	<jsp:param name="job" value="반장님"/>
 </jsp:forward>
 
<body>
	<div class="w3-content mxw">
		<div class="w3-col w3-padding w3-card-4 w3-margin-top w3-round-large w3-border w3-border-amber">
			<div class="w3-col">
				<h3 class="w3-col m3 w3-right-align w3-padding">I D : </h3>
				<h3 class="w3-col m8 w3-padding"><%=pid %></h3>
			</div>
			<div class="w3-col">
				<h3 class="w3-col m3 w3-right-align w3-padding">P W : </h3>
				<h3 class="w3-col m8 w3-padding""><%=ppw %></h3>
			</div>
		</div>
	</div>
</body>
</html>