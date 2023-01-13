<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>game</title>
    <script src="resources/mylib/game.js" defer></script>
    <!-- <script src="resources/mylib/chat.js" defer></script> -->
    <link rel="stylesheet" href="resources/mylib/home.css">
    <link rel="stylesheet" href="resources/mylib/game.css">
</head>

<script type="text/javascript">


window.onload = () =>{
	var ws;
	var chating = document.getElementById('chating');
	var sendBtn = document.getElementById('sendBtn');
	var chatting = document.getElementById('chatting');
	
	console.log(${loginID})
	// wsOpen
	ws = new WebSocket("ws://"+ location.host + "/ws/game");
	
	// wsEvent
	ws.onopen = data => {}
	
	ws.onmessage = data => {
		var msg = data.data;
		if (msg != null && msg.trim() != '') {
			chating.innerHTML += "<p>" + msg + "</p>";
		}
	} // onmessage
	
	document.addEventListener('keypress', e => {
		if(e.keyCode == 13) { // Enter
			var userName = ${loginID};
			var chatting = document.getElementById('chatting');
			var msg = chatting.value;
			ws.send(userName + " : " + msg);
			chatting.value = '';
		}
	});
	
	sendBtn.addEventListener('click', ()=>{
		var userName = ${loginID};
		var chatting = document.getElementById('chatting');
		var msg = chatting.value;
		ws.send(userName + " : " + msg);
		chatting.value = '';
	})
	 
} // onload

</script>

<body>

	<header id="header">
		<div class="logo nav">
			<a href="/">HANGIN2C</a>
		</div>

		<div class="nav">
			<ul>
				<li><a href="/">메인</a></li>
				<li><a href="game">게임</a></li>
				<li><a href="chatroom">채팅방</a></li>
				<li><a href="attachboard">공략게시판</a></li>
			</ul>
		</div>

		<div class="nav">
			<ul>
				<li>검색</li>
				<c:if test="${empty loginID}">
					<li>로그인</li>
					<li>회원가입</li>
				</c:if>
				<c:if test="${not empty loginID}">
					<li>${not empty loginID}</li>
				</c:if>
			</ul>
		</div>
	</header>
	
	<main id="game-main">
        <div id="game-board">

        </div>

        <div id="chat-board">
            <div class="h1 chat-title">CHATTING BOARD</div>
            <c:forEach items="${chatUser}" var="user" >
            	<div>${user}</div>
            </c:forEach>
			
            <div id="chating" class="chating">
		</div>
		
		<div id="yourMsg">
			<table class="inputTable">
				<tr>
					<th>메시지</th>
					<th><input id="chatting" placeholder="보내실 메시지를 입력하세요."></th>
					<th><button id="sendBtn">보내기</button></th>
				</tr>
			</table>
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