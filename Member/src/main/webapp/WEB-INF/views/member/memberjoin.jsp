<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>/member/memberjoin.jsp 개인 </h1>

<fieldset>
		<legend>회원가입</legend>
		<!-- action 속성 값이 없는 경우 : 자기자신의 주소를 호출 -->
		<form action="" method="post">
			아이디 : <input type="text" name="userid"> <br>
			비밀번호 : <input type="password" name="userpw"> <br>
			이름 : <input type="text" name="username"> <br>
			이메일 : <input type="email" name="useremail"> <br>
			<br>
			<input type="submit" value="회원가입">
		</form>
	</fieldset>


</body>
</html>