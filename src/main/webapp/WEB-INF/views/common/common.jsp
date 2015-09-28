<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator"
	prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><decorator:title default="OrangeRoad" /></title>

<script src="${root}/resources/js/jquery-1.11.3.min.js"></script>
<script src="${root}/resources/bootstrap-3.3.5-dist/css/bootstrap.css"></script>
<decorator:head/>
</head>
<body>
	<c:if test="${loginUser.grade == 'master' }">
	<a href="${root}/admin/admin">관리자 페이지</a>
	</c:if>
	
	<c:if test="${loginUser!=null}">
	<a href="${root }/member/logout">로그아웃</a>
	<a href="#">마이페이지</a>
	</c:if>
	
	<c:if test="${loginUser==null}">
	<a href="${root}/member/sign">회원가입</a>
	<a href="${root}/member/login">로그인</a>
	</c:if>
	
	<a href="#">정기후원</a>
	<a href="#">일시후원</a>
	<a href="#">맞춤후원</a>
	
	<a href="#">소개</a>
	<a href="${root}/board/viewBoard">공지사항</a>
	<a href="#">스토리</a>
	
	<br/>
	<decorator:body/>
	<br/>
	<div>footer</div>
</body>
</html>