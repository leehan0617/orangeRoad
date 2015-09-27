<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
	sign.jsp
	
	<form action="${root}/member/sign" method="post">
		아이디<input type="text" name="id"/>
		비밀번호<input type="password" name="password"/>
		name<input type="text" name="name"/>
		age<input type="text" name="age"/>
		주소<input type="text"name="address"/>
		이메일<input type="text" name="mail"/>
		메일수신여부<input type="text" name="mailing"/>
		연락처<input type="text" name="phone"/>
		gender<input type="text" name="gender"/>
		
		grade<input type="text" name="grade"/>
		<input type="submit" value="sendInfo"/>
	</form>
</body>
</html>