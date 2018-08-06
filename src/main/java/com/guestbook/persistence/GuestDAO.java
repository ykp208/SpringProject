package com.guestbook.persistence;


import java.util.HashMap;
import java.util.List;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;

public interface GuestDAO {

	
	//자료넣기
	public void guestInsert(String sqlId,GuestDTO gdto);
	
	//리스트뽑기
	public List<GuestDTO> guestList(String sqlId,HashMap<String, Object> hm);

	//상세보기
	public GuestDTO guestView(String sqlId,int num);
	
	//지우기
	public void guestDelete(String sqlId,int num);
	
	//개시물 개수 구하기
	public int guestcount(String sqlId,HashMap<String, String> hm);
	
	//로그인
	public MemberDTO login(String sqlId,String userid);
	
	
	
	
}
