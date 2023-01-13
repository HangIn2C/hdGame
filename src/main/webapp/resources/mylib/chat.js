var ws;
var chating = document.getElementById('chating');

function wsOpen() {
	ws = new WebSocket("ws://"+ location.host + "/ws/game");
	wsEvent();
} // wsOpen

function wsEvent() {
	ws.onopen = data => {}
	
	ws.onmessage = data => {
		var msg = data.data;
		if (msg != null && msg.trim() != '') {
			chating.innerHTML += "<p>" + msg + "</p>";
		}
	} // onmessage
	
	document.addEventListener('keypress', e => {
		if(e.keyCode == 13) { // Enter
			send();
		}
	});
} // wsEvent


function chatName() {
	var userName = document.getElementById('userName').value;
	console.log(userName);
	if(userName == null || userName.trim() == '') {
		alert("사용자 이름을 입력해주세요.")
	} else {
		wsOpen();
	}
} // chatName

function send() {
	var userName = document.getElementById('userName').value;
	var chatting = document.getElementById('chatting');
	var msg = chatting.value;
	ws.send(userName + " : " + msg);
	chatting.innerHTML = '';
} 