<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Sweetel</title>
</head>
<link rel="stylesheet" type="text/css" href="resources/library/style.css" >
<body>
	<nav class="navbar">
		<div id="logo">
			<a href="home">SWEETEL</a>
		</div>
		<c:if test="${loginID == null}">
		<ul id="menu">
			<li><a href="loginf">로그인</a></li>
			<li><a href="plus">더보기</a></li>
		</ul>
		</c:if>
		<c:if test="${loginID != null }">
		<ul id="menu">
			<li><a href="logout">로그아웃</a></li>
			<li><a href="plus">더보기</a></li>
		</ul>
		</c:if>
	</nav>
	<div id="screen" align="center">
		<img alt="sweetel" src="resources/image/sweetel_logo.jpg" width="800"
			height="500">
	</div>
</body>
</html>
