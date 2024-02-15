<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h1>/member/update.jsp 개인 </h1>
<fieldset>
		<legend>회원정보 수정창</legend>
	
		<form action="/member/update" method = "post">
			아이디 : <input type = "text" name = "userid" value="${resultVO.userid }" readonly="readonly"> <br>
			비밀번호 : <input type="password" name = "userpw" placeholder="비밀번호 입력"> <br>
			이름 : <input type="text" name = "username" value="${resultVO.username }"> <br>
			이메일 : <input type="text" name = "useremail" value="${resultVO.useremail }" readonly> <br>
			<br>
			<input type = "submit" value = "수정하기">
			
			
		</form>
	</fieldset>


</body>
</html>