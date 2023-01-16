package com.game.hdGame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.game.hdGame.page.Paging;
import com.game.hdGame.service.BoardService;

@Controller
public class boardController {
	
	@Autowired
	BoardService boardService;
	
	@RequestMapping(value = "board")
	public String boardTotal(Model md, Paging page) {
		// 전체 페이지 수 계산
			boardService.boardTotalCount();
		// 
		
		return "board";
	}
}
