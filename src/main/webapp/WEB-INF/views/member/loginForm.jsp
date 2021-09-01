<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sweetel Login Form</title>
<script src="resources/library/jquery-3.2.1.min.js"></script>
<script src="resources/library/home.js"></script>
</head>
<body>
<table>
	<form action="login" method="post">
	<tr><td><input type="text" id="id" name="id" placeholder="아이디를 입력해주세요."></td></tr>
	<tr><td><input type="password" id="pw" name="pw" placeholder="비밀번호를 입력해주세요."></td></tr>
	<tr><td><button id="login">로그인</button></td>&nbsp;&nbsp;
		<td><a href="joinf">회원가입</a></td>
	</tr>
	</form>
</table>
</body>
</html>