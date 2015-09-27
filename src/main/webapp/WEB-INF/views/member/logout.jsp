<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	<c:remove var="loginUser" scope="session"/>
	
	<script>
		alert("로그아웃 성공");
		location.href="${root}/mju";
	</script>
</body>
</html>