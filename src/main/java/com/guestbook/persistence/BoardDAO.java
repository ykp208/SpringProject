package com.guestbook.persistence;

import java.util.List;

import com.guestbook.domain.BoardDTO;

public interface BoardDAO {

	//전체 검색
	public List<BoardDTO> boardList(String sqlId);
	
	//업데이트
	public int boardupdate(String sqlId, BoardDTO bdto);
	
	//쓰기
	public void boardWrite(String sqlId,BoardDTO bdto);
	
	//상세보기
	public BoardDTO boardView(String sqlId,int num);
	
	//삭제
	public int boardDelete(String sqlId,int num,String pwd);
	
	
	
}
