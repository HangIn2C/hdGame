package com.game.hdGame.service;

import java.util.List;

import com.game.hdGame.vo.UserVO;

public interface UserService {
	public List<UserVO> userList();
	public UserVO userDetail(UserVO vo);
	public int userInsert(UserVO vo);
	public void userLogIn(UserVO vo);
	public int userUpdate(UserVO vo);
	public int userDelete(UserVO vo);
}
