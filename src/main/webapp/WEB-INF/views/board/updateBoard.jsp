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
	<form method="post" action="${root}/board/updateBoard">
		제목 : <input type="text" name="title" value="${board.title }"/>
		내용 : <input type="text" name="content" value="${board.content }"/>
		<input type="submit" value="수정"/>
		<input type="hidden" name="boardNumber" value="${board.boardNumber }"/>
	</form>
</body>
</html>