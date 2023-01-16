package com.game.hdGame.controller;

import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.game.hdGame.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping({"/", "home"})
	public String home() {
		return "home";
	}
	
	// =============================================
	
	@RequestMapping("gamepage")
	public String game(HttpServletRequest request, Model md) {
		List<String> list = new LinkedList<String>();
		list.add((String) request.getSession().getAttribute("loginID"));
		
		md.addAttribute("chatUser", list);
		System.out.println(list);
		return "pages/gamePage";
	}

	// =============================================
	
	@RequestMapping("chatpage")
	public String chatRoom() {
		return "pages/chatRoomPage";
	}
	
	// =============================================
	
	@RequestMapping("attackboardpage")
	public String attackBoard() {
		return "pages/attackBoardPage";
	}
	
	@RequestMapping("attackinsert")
	public String attackInsertPage() {
		
		return "pages/attackInsertPage";
	}
	// =============================================
	
	@RequestMapping("loginpage")
	public String login() {
		return "pages/loginPage";
	}
	
	// =============================================
	
	@RequestMapping("signinpage")
	public String signIn() {
		return "pages/signInPage";
	}
	
	// =============================================
	
	@RequestMapping(value = "chatremove")
	public void chatRemove(HttpServletRequest request, Model md) {
		List<String> list = new LinkedList<String>();
		list.remove((String) request.getSession().getAttribute("loginID"));
		md.addAttribute("chatUser", list);
	}
}
