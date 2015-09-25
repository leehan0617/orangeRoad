<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Orange Road v1.1</title>
</head>
<body>
	<a href="${root}/member/sign">회원가입</a>
	<a href="#">정기후원</a>
	<a href="#">일시후원</a>
	<a href="#">맞춤후원</a>
	
	<a href="#">소개</a>
	<a href="${root}/board/viewBoard">공지사항</a>
	<a href="#">스토리</a>
	
	<a href="#">마이페이지</a>
</body>
</html>