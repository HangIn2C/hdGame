package com.game.hdGame.handler;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SocketHandler extends TextWebSocketHandler {
	
	HashMap<String, WebSocketSession> sessionMap = new HashMap<String, WebSocketSession>(); // 소켓 세션을 담아둘 맵
	List<String> list = new LinkedList<String>();
	
	// 소켓 연결
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		super.afterConnectionEstablished(session);
		System.out.println(session.getId() ); 
		sessionMap.put(session.getId(), session);
	}
	
	// 메시지 발송
	// payload : 보내고자 하는 데이터 자체를 의미
	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		String msg = message.getPayload();
		for (String key : sessionMap.keySet()) {
			WebSocketSession wss = sessionMap.get(key);
			try {
				wss.sendMessage(new TextMessage(msg) );
			} catch (Exception e) {
				e.printStackTrace();
			} // try ~ catch
		} // for
	} //
	
	// 소켓 해제
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		System.out.println(session.getId() );
		sessionMap.remove(session.getId() );
		super.afterConnectionClosed(session, status);
	}
}
