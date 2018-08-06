package com.guestbook.persistence;

import java.util.List;

import com.guestbook.domain.BoardDTO;

public class BoardDAOImpl implements BoardDAO{

	@Override
	public List<BoardDTO> boardList(String sqlId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int boardupdate(String sqlId, BoardDTO bdto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void boardWrite(String sqlId, BoardDTO bdto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDTO boardView(String sqlId, int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int boardDelete(String sqlId, int num, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
