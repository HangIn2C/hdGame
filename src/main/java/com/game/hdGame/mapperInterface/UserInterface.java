package com.game.hdGame.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.game.hdGame.vo.UserVO;

@Repository
@Mapper
public interface UserInterface {
	@Select("SELECT * FROM user")
	public List<UserVO> userList();
	
	@Select("SELECT * FROM user WHERE id = #{id}")
	public UserVO userDetail(UserVO vo);
	
	@Insert("INSERT INTO user(id, password) VALUES(#{id}, #{password})")
	public int userInsert(UserVO vo);
	
	public void userLogIn(UserVO vo);
	
	@Update("UPDATE user SET password = #{password} WHERE id = #{id} ")
	public int userUpdate(UserVO vo);
	
	@Delete("DELETE FROM user WHERE id = #{id}")
	public int userDelete(UserVO vo);
}
