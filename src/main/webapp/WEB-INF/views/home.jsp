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
				<li><a href="attackboardpage">공략게시판</a></li>
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

	<div id="slide-container">
		<div class="slide-box">
			<img id="slide-img" src="resources/images/chess.jpg" alt="">
			<div class="slide-content">
				<div class="slide-title">CHESS</div>
				<div class="slide-detail">
					<p>64개의 칸에서 이루어지는 치열한 두뇌전</p>
					<p>상대의 수를 읽어 왕을 잡아 최후의 승자가 되어라</p>
				</div>

				<div class="slide-button-box">
					<div class="button">
						<a href="game/chess">게임 참가</a>
					</div>
					<div class="button">
						<a href="chat/chess">채팅방 입장</a>
					</div>
				</div>
			</div>
		</div>

		<div id="slide-nav">
			<div class="cursor">CHESS</div>
			<div class="cursor">CARD</div>
			<div class="cursor">BADUK</div>
			<div class="cursor">TICTACTOE</div>
		</div>
	</div>

	<main>
		<div class="h1">게임 더 보기</div>

		<!-- ================================================================ -->
		<!-- main container -->
		<div id="slide-container-2">
			<div class="slide-box-2">
				<img src="resources/images/chess.jpg" alt="">
				<div class="slide-title-2">CHESS</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/card.jpg" alt="">
				<div class="slide-title-2">CARD</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/baduk.jpg" alt="">
				<div class="slide-title-2">BADUK</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/tic_tac_toe.jpg" alt="">
				<div class="slide-title-2">TICTACTOE</div>
			</div>
		</div>

		<!-- ================================================================ -->
		<!-- container -->
		<div class="h1">채팅방</div>
		<!-- chat container -->
		<div id="chat-container">
			<div>
				<ul>
					<li>CHESS</li>
					<li>CARD</li>
					<li>BADUK</li>
					<li>TICTACTOE</li>
				</ul>
			</div>
			<div>
				<div>현재 개설된 채팅방</div>

				<hr>

				<div></div>

			</div>
		</div>
		<div class="button-box">
			<div class="button"><a href="chatpage">모든 채팅방</a></div>
		</div>

		<!-- ================================================================ -->
		<!-- container -->
		<div class="h1">공략게시판</div>
		<!-- main container -->
		<div id="slide-container-2">
			<div class="slide-box-2">
				<img src="resources/images/chess.jpg" alt="">
				<div class="slide-title-2">CHESS</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/card.jpg" alt="">
				<div class="slide-title-2">CARD</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/baduk.jpg" alt="">
				<div class="slide-title-2">BADUK</div>
			</div>

			<div class="slide-box-2">
				<img src="resources/images/tic_tac_toe.jpg" alt="">
				<div class="slide-title-2">TICTACTOE</div>
			</div>
		</div>
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