package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.BoardDTO;

public interface BoardService {

	
	//전체 검색
		public List<BoardDTO> boardList();
		
		//업데이트
		public int boardupdate( BoardDTO bdto);
		
		//쓰기
		public void boardWrite(BoardDTO bdto);
		
		//상세보기
		public BoardDTO boardView(int num);
		
		//삭제
		public int boardDelete(int num,String pwd);
		
		
}
