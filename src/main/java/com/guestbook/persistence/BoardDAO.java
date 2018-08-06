package com.guestbook.persistence;

import java.util.List;

import com.guestbook.domain.BoardDTO;

public interface BoardDAO {

	//��ü �˻�
	public List<BoardDTO> boardList(String sqlId);
	
	//������Ʈ
	public int boardupdate(String sqlId, BoardDTO bdto);
	
	//����
	public void boardWrite(String sqlId,BoardDTO bdto);
	
	//�󼼺���
	public BoardDTO boardView(String sqlId,int num);
	
	//����
	public int boardDelete(String sqlId,int num,String pwd);
	
	
	
}
