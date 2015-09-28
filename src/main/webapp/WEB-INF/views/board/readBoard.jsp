<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<script>
	function deleteBoard(){
		var check = confirm("정말 삭제하시겠습니까?");
		
		if(check){
			$.ajax({
				url:"${root}/board/deleteBoard?boardNumber=${board.boardNumber}",
				success:function(data){
					location.href="${root}/board/viewBoard";
					alert("삭제완료");
				}
			});
		}
		
	}
</script>
</head>
<body>
	readBoard
	<div>제목 : ${board.title } </div>
	<div>내용 : ${board.content }</div>
	<div>등록일 : <fmt:formatDate value="${board.registerDate}" pattern="yy-MM-dd"/> </div>
	<div>
		<a href="${root }/board/viewBoard?currentPage=${currentPage}">목록으로</a>
	</div>
	<div>
		<c:if test="${loginUser.grade == 'master' }">
			<a href="${root}/board/updateBoard?boardNumber=${board.boardNumber}">수정하기</a>
			<input type="button" value="테스트" onclick="deleteBoard()"/>
		</c:if>
	</div>
</body>
</html>