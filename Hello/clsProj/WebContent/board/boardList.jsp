<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>게시판 리스트 페이지</title>
  	<link rel="stylesheet" href="/clsProj/css/w3.css">
	<script type="text/javascript" src="/clsProj/js/jquery-3.5.0.min.js"></script>
	<script type="text/javascript">
	$(function(){
		$('#write').click(function(){
			$(location).attr('href', '/clsProj/board/boardWrite.cls');
		});
	});
	</script>
<style>
    .mxw {
   	 	max-width: 1200px;
	 }
    .bnone {
    	display: none;
    }
</style>
</head>
<body>
    <div class="w3-content mxw">
        <div class="w3-center w3-col ">
            <h2>인크레파스 게시판</h2>
        </div>
        <div class="w3-rwo w3-margin-top">
            <div class="w3-col w3-padding w3-right-align w3-margin">
                <div class="w3-button w3-red" id="write">글쓰기</div>
            </div>
            <table class="w3-col w3-table-all w3-hoverable">
              <thead>
                <tr class="w3-light-grey">
                  <th>글번호</th>
                  <th>제목</th>
                  <th>작성자</th>
                  <th>작성일</th>
                  <th>조회수</th>
                </tr>
              </thead>
              <c:forEach var="data" items="${LIST}">
	              <tr class="w3-text-gray" id="text">
	                <td>${data.bno}</td>
	                <td>${data.title}</td>
	                <td>${data.id}</td>
	                <td>${data.sdate}</td>
	                <td>${data.click}</td>
	              </tr>
              </c:forEach>
            </table>
        </div>
      </div>
</body>
</html>