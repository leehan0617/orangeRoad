<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="root" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	로그인 페이지 
	
	<form method="post" action="${root }/member/login">
		<h1>id:</h1><input type="text" name="id"/>
		<h1>pwd:</h1><input type="password" name="pwd"/>
		<input type="submit" id="login" value="login"/>
	</form>
</body>

</html>