package com.game.hdGame.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		if(userservice.userInsert(vo) > 0);
		return "home";
	}
	
	@PostMapping(value = "login")
	public String login(HttpServletRequest request, UserVO vo) {
		// user id 정보 검색
		vo = userservice.userDetail(vo);
		
		Model mv = null;
		HttpSession session = request.getSession();
		
		// id 확인
		if (request.getParameter("id").equals(vo.getId())) {
			// password 확인
			if(request.getParameter("password").equals(vo.getPassword()) ) {
				// id & password 완료 되면 session에 저장
				session.setAttribute("loginID", vo.getId());
			} else {
				mv.addAttribute("message", "PASSWORD가 틀렸습니다.");
				return "home";
			} // if ~ else password
		} else {
			// id 틀린 경우
			mv.addAttribute("message", "ID가 틀렸습니다.");
			return "home";
		} // if ~ else id
		return "home";
	} // login
	
	@GetMapping(value = "logout")
	public String logout(HttpServletRequest request) {
		
		request.getSession().invalidate();
		return "home";
	} // logout
	
	@PostMapping(value = "update")
	public String update() {
		return null;
	}
	
	@PostMapping(value = "delete")
	public String delete() {
		return null;
	}
	
}
