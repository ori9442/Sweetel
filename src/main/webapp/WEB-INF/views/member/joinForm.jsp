<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/library/jquery-3.2.1.min.js"></script>
<script src="resources/library/home.js"></script>
</head>
<body>
<table>
<form action="join" method="post" id="joinform">
	<tr>ID<td><input type="text" id="id" name="id" placeholder="아이디를 입력해주세요"></td></tr>
	<tr>PW<td><input type="password" id="pw" name="pw" placeholder="패스워드를 입력해주세요"></td></tr>
	<tr>NAME<td><input type="text" id="name" name="name" placeholder="이름를 입력해주세요"></td></tr>
	<tr>EMAIL<td><input type="email" id="email" name="email" placeholder="이메일를 입력해주세요"></td></tr>
	<tr>PHONENUM<td><input type="tel" id="phonenum" name="phonenum" placeholder="전화번호를 입력해주세요"></td></tr>
	<tr><td><button id="join">가입</button>&nbsp;&nbsp;<input type="reset" value="취소"><td></tr>
</form>
</table>
</body>
</html>