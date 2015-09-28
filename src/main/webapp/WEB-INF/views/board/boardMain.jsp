<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<c:set var="boardList" value="${boardList}"/>
<c:set var="boardSize" value="${boardSize}"/>
<c:set var="blockSize" value="${blockSize }"/>
<c:set var="blockCount" value="${blockCount }"/>
<fmt:parseNumber var="rs" value="${(currentPage-1)/blockSize }" integerOnly="true"/>
<c:set var="startRow" value="${rs*blockSize+1 }"/>
<c:set var="endRow" value="${startRow+blockSize-1 }"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<c:forEach var="board" items="${boardList }">
		<div>
			<span>${board.boardNumber }</span>
			<span><a href="${root}/board/readBoard?boardNumber=${board.boardNumber}&currentPage=${currentPage}">${board.title}</a></span>
			<span><fmt:formatDate value="${board.registerDate}" pattern="yy-MM-dd"/></span>
			<br/>
		</div>
	</c:forEach>
	<c:if test="${startRow > blockSize}">
		<a href="${root}/board/viewBoard?currentPage=${startRow-blockSize}">[Previous]</a>
	</c:if>
	<c:forEach var="blockNumber" begin="${startRow}" end="${endRow}">
		<c:if test="${blockNumber<(allBoards/boardSize)+1 }">
			<a href="${root}/board/viewBoard?currentPage=${blockNumber}">[${blockNumber}]</a>
		</c:if>
	</c:forEach>
	<c:if test="${endRow < blockCount }">
		<a href="${root}/board/viewBoard?currentPage=${startRow+blockSize}">[Next]</a>
	</c:if>
	
	<c:if test="${loginUser.grade == 'master' }">
		<a href="${root}/board/writeBoard">글쓰기</a>
	</c:if>
</body>
</html>