<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>/member/main.jsp 개인</h1>
	
	<!-- 로그인 정보가 없는 경우 다시 로그인 페이지로 이동 -->
	<c:if test="${empty id }">
		<c:redirect url="/member/login"/>
	</c:if>
	
	<!-- 로그인한 사용자의 아이디를 출력 -->
	${sessionScope.id } 님 환영합니다. <br>
	
	<br>
	
	<input type="button" value="로그아웃" onclick="location.href='/member/logout';">
	<!-- <a href="javascript:location.href='/member/logout';">로그아웃</a> -->
	
	
	<hr>
	
	<h3><a href="/member/info">회원정보 조회</a></h3>

	<h3><a href="/member/update">회원정보 수정</a></h3>
	
	<h3><a href="/member/delete">회원정보 삭제</a></h3>
	
	<c:if test="${ !empty id && id.equals('admin') }">
	<hr>
	<h3><a href="/member/list">회원정보 목록</a></h3>
	</c:if>
</body>
</html>