<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>/member/delete.jsp 개인</h1>

	<c:if test="${not empty errorMsg}">
    <script type="text/javascript">
        alert("${errorMsg}");
    </script>
	</c:if>	

	<fieldset>
		<legend>회원정보 삭제(탈퇴)</legend>
		<form action ="/member/delete" method = 'post'>
			<input type="hidden" name = "userid" value = "${sessionScope.id }">
			비밀번호: <input type="password" name = "userpw" placeholder="비밀번호를 입력하시오"> <br>
			
			<input type="submit" value = "탈퇴하기">
	
		</form>
	</fieldset>

	

</body>
</html>