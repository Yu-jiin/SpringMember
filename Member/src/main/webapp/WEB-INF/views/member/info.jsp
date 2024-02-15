<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>/member/info.jsp 개인</h1>
	
	<h3>아이디 : ${resultVO.userid }</h3>
	<h3>비밀번호 : ${resultVO.userpw }</h3>
	<h3>이름 : ${resultVO.username }</h3>
	<h3>이메일 : ${resultVO.useremail }</h3>
	<h3>회원가입일 : ${resultVO.regdate }</h3>

 <hr>
 	<a href="/member/main"> 메인페이지로 이동 </a>

</body>
</html>