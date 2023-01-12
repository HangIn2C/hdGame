package com.game.hdGame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class MainController {
	
	@RequestMapping({"/", "home"})
	public String home() {
		return "home";
	}
	
	@RequestMapping("game")
	public String game() {
		return "pages/game";
	}

	@RequestMapping("chatroom")
	public String chatRoom() {
		return "pages/chatRoom";
	}
	
	@RequestMapping("attackboard")
	public String attackBoard() {
		return "pages/attackBoard";
	}
	
	@RequestMapping("loginPage")
	public String login() {
		return "pages/login";
	}
	
	@RequestMapping("signPage")
	public String signIn() {
		return "pages/signIn";
	}
}
