<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<!-- TODO 10 spring boot 첫 페이지 -->
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>전체 조회</legend>
		<a href="./selectJobs.do">Jobs 전체 조회 실행</a>
	</fieldset>
	<fieldset>
		<legend>입력</legend>
		<form action="./insertJobs.do" method="post">
			아이디:	<input type="text" name="id"><br>
			직업명:	<input type="text" name="title"><br>
			최소급여:	<input type="text" name="minSal"><br>
			최대급여:	<input type="text" name="maxSal"><br>
			사용입력:	<span>SQL문에서 default로 Y 입력</span><br>
			<input type="submit" value="정보입력">
		</form>
	</fieldset>
	<fieldset>
		<legend>수정</legend>
		<a href="./updateJobs.do">Jobs의 모든 USEAGE를 'N'으로 변경</a>
	</fieldset>
	<fieldset>
		<legend>Transaction 처리</legend>
		<a href="./transaction.do">update 성공&amp;insert 성공</a>
	</fieldset>
</body>
</html>