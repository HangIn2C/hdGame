package com.game.hdGame.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.game.hdGame.mapperInterface.UserInterface;
import com.game.hdGame.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserInterface userinterfce;
	
	@Override
	public List<UserVO> userList() { return userinterfce.userList(); }
	@Override
	public UserVO userDetail(UserVO vo) { return userinterfce.userDetail(vo); }
	@Override
	public int userDelete(UserVO vo) { return userinterfce.userDelete(vo); }
	@Override
	public int userInsert(UserVO vo) { return userinterfce.userInsert(vo); }
	@Override
	public void userLogIn(UserVO vo) {}
	@Override
	public int userUpdate(UserVO vo) { return userinterfce.userUpdate(vo); }
	
}
