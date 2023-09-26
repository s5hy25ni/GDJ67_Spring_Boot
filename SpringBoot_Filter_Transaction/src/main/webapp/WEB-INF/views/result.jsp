<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- TODO 11 Controller의 select 결과를 출력하는 페이지 -->
<title>전체조회 결과화면</title>
</head>
<body>
<button onclick="history.back(-1)">뒤로!</button>
<fieldset>
	<legend>전체조회</legend>
	<div>
		<c:forEach items="${selectresult}" var="vo">
			${vo}<br>
		</c:forEach>
	</div>
</fieldset>
<fieldset>
	<legend>입력</legend>
	<div>
		${insertresult}
	</div>
</fieldset>
<fieldset>
	<legend>수정</legend>
	<div>
		${updateresult}
	</div>
</fieldset>
</body>
</html>