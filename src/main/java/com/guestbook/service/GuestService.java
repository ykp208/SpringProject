package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;

public interface GuestService {

		//자료넣기
		public void guestInsert(GuestDTO gdto);
		
		//리스트뽑기
		public List<GuestDTO> guestList(String field,String word, int startRow,int endRow);

		//상세보기
		public GuestDTO guestView(int num);
		
		//지우기
		public void guestDelete(int num);
		
		//개시물 개수 구하기
		public int guestcount(String field,String word);
		
		//로그인
		public MemberDTO login(String userid);
		
		
		
}
