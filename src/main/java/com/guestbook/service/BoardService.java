package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.BoardDTO;

public interface BoardService {

	
	//��ü �˻�
		public List<BoardDTO> boardList();
		
		//������Ʈ
		public int boardupdate( BoardDTO bdto);
		
		//����
		public void boardWrite(BoardDTO bdto);
		
		//�󼼺���
		public BoardDTO boardView(int num);
		
		//����
		public int boardDelete(int num,String pwd);
		
		
}
