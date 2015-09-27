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
	<c:set var="loginUser" value="${member}" scope="session"/>
	
	<script>
		alert("로그인 성공");
		location.href="${root}/mju";
	</script>
</body>
</html>