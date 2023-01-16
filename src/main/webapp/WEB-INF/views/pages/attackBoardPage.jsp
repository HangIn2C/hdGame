<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>home</title>
<script src="resources/mylib/main.js" defer></script>
<link rel="stylesheet" href="resources/mylib/home.css">
<link rel="stylesheet" href="resources/mylib/board.css">
</head>
<body>
	<!-- header container -->
	<header id="header">
		<div class="logo nav">
			<a href="/">HANGIN2C</a>
		</div>

		<div class="nav">
			<ul>
				<li><a href="/">메인</a></li>
				<li><a href="gamepage">게임</a></li>
				<li><a href="chatpage">채팅방</a></li>
				<li><a href="attachboardpage">공략게시판</a></li>
			</ul>
		</div>

		<div class="nav">
			<ul>
				<li>검색</li>
				<c:if test="${empty loginID}">
					<li><a href="loginpage">로그인</a></li>
					<li><a href="signinpage">회원가입</a></li>
				</c:if>
				<c:if test="${not empty loginID}">
					<li>${loginID}</li>
					<li><a href="logout">logout</a></li>
				</c:if>
			</ul>
		</div>
	</header>

	<main>
		<h1>공략 게시판</h1>
		
		<ul>
			<li>Total</li>
			<li>CHESS</li>
			<li>CARD</li>
			<li>BADUK</li>
			<li>TICTACTOE</li>
		</ul>
		
		<table>
			<thead>
				<tr>
					<th>게임</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
					<th>추천수</th>
					<th>생성날짜</th>
				</tr>
			</thead>
			
			<tbody>
				<tr>
					<td>게임</td>
					<td>잘하는법</td>
					<td>123</td>
					<td>1</td>
					<td>1</td>
					<td>2023-1-13</td>
				</tr>
			</tbody>
		
		</table>
		
		<div><a href="attackinsert">글작성</a></div>
	</main>
	
	

	<footer>
		<div>
			<div class="logo">
				<a href="/">HANGIN2C</a>
			</div>
		</div>
	</footer>
</body>

</html>