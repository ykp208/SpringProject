package com.guestbook.persistence;


import java.util.HashMap;
import java.util.List;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;

public interface GuestDAO {

	
	//�ڷ�ֱ�
	public void guestInsert(String sqlId,GuestDTO gdto);
	
	//����Ʈ�̱�
	public List<GuestDTO> guestList(String sqlId,HashMap<String, Object> hm);

	//�󼼺���
	public GuestDTO guestView(String sqlId,int num);
	
	//�����
	public void guestDelete(String sqlId,int num);
	
	//���ù� ���� ���ϱ�
	public int guestcount(String sqlId,HashMap<String, String> hm);
	
	//�α���
	public MemberDTO login(String sqlId,String userid);
	
	
	
	
}
