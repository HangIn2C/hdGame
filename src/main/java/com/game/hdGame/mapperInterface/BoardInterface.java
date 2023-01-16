package com.game.hdGame.mapperInterface;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.game.hdGame.vo.BoardVO;

@Repository
@Mapper
public interface BoardInterface {
	public List<BoardVO> boardList();
	public BoardVO boardDetail();
	public int boardInsert();
	public int boardUpdate();
	public int boardDelete();
	
}
