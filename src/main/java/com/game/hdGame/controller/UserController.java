package com.game.hdGame.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.game.hdGame.service.UserService;
import com.game.hdGame.vo.UserVO;

@Controller
public class UserController {
	
	@Autowired
	UserService userservice;
	
	@GetMapping(value = "list")
	public String list() {
		return null;
	}
	
	@PostMapping(value = "signin")
	public String sign(UserVO vo) {
		if(userservice.userInsert(vo) > 0) System.out.println(1);
		return "home";
	}
	
	@SuppressWarnings("null")
	@PostMapping(value = "login")
	public String login(HttpServletRequest request, UserVO vo) {
		userservice.userDetail(vo);
		Model mv = null;
		// id 확인
		if (request.getParameter("id").equals(vo.getId())) {
			// password 확인
			if(request.getParameter("password").equals(vo.getPassword()) ) {
				
			}
			
			
		} else {
			// id 틀린 경우
			mv.addAttribute("message", "ID가 틀렸습니다.");
		}
		return "home";
	}
	
	@PostMapping(value = "update")
	public String update() {
		return null;
	}
	
	@PostMapping(value = "delete")
	public String delete() {
		return null;
	}
	
}
