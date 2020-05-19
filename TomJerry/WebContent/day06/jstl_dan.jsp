<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Dan</title>
<link rel="stylesheet" href="/TomJerry/css/w3.css">
<link rel="stylesheet" href="/TomJerry/css/user.css">
</head>
<body>

	<div class="w3-content w3-center">
		<c:forEach var="i" begin="2" end="9">
			<div class="w-150 inblock w3-margin w3-card-4">
				<h4 class="w3-text-bold"> ${i }단</h4>
				<div class="w3-center w3-padding">
					<c:forEach var="j" begin="1" end="9">
						<h4 class="w3-pale-red w3-button w3-text-gray">${i } x ${j }
							= ${i*j }</h4>
					</c:forEach>
				</div>
			</div>
		</c:forEach>
	</div>
</body>
</html>