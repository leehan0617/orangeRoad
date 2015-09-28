<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${root}/board/writeBoard" method="post">
		<input type="text" name="title"/>
		<input type="text" name="content"/>
		<input type="submit" value="글쓰기"/>
		<a href="${root}/board/viewBoard">뒤로가기</a>
	</form>
</body>
</html>