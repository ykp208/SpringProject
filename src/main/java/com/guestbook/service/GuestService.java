package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;

public interface GuestService {

		//�ڷ�ֱ�
		public void guestInsert(GuestDTO gdto);
		
		//����Ʈ�̱�
		public List<GuestDTO> guestList(String field,String word, int startRow,int endRow);

		//�󼼺���
		public GuestDTO guestView(int num);
		
		//�����
		public void guestDelete(int num);
		
		//���ù� ���� ���ϱ�
		public int guestcount(String field,String word);
		
		//�α���
		public MemberDTO login(String userid);
		
		
		
}
