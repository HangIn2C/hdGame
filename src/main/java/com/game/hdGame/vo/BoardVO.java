package com.game.hdGame.vo;

import lombok.Data;

@Data
public class BoardVO {
	private int no;
	private String type;
	private String title;
	private String content;
	private String id;
	private String createtime;
	private int root;
	private int step;
	private int indent;
}
