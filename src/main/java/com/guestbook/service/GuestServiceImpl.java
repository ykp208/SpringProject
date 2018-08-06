package com.guestbook.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;
import com.guestbook.persistence.GuestDAOImpl;


@Service
public class GuestServiceImpl implements GuestService{

	@Autowired
	private GuestDAOImpl gdao;
	
	@Override
	public void guestInsert(GuestDTO gdto) {
		gdao.guestInsert(".guestInsertData", gdto);
		
	}

	@Override
	public List<GuestDTO> guestList(String field, String word, int startRow, int endRow) {
		// TODO Auto-generated method stub
		String sqlId="";
		if(word.equals("")) {
			sqlId=".noguestListData";
		}else {
			sqlId=".yesguestListData";
		}
		System.out.println(sqlId);
		HashMap<String, Object> hm = new HashMap<String, Object>();
		hm.put("field", field);
		hm.put("word", word);
		hm.put("startRow", startRow);
		hm.put("endRow", endRow);
		System.out.println(hm);
		
		return gdao.guestList(sqlId, hm);
	}

	@Override
	public GuestDTO guestView(int num) {
		// TODO Auto-generated method stub
		return gdao.guestView(".guestViewData", num);
	}

	@Override
	public void guestDelete(int num) {
		
		gdao.guestDelete(".guestDeleteData", num);
	}

	@Override
	public int guestcount(String field, String word) {
		
		String sqlId="";
		
		if(word.equals("")) {
			
			sqlId=".noWordGuestCountData";
		}else {
			
			sqlId=".yesWordGuestCountData";
		}
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put(field, field);
		hm.put(word, word);
		
		return gdao.guestcount(sqlId, hm);
	}

	@Override
	public MemberDTO login(String userid) {
		// TODO Auto-generated method stub
		return gdao.login(".memberLoginData", userid);
	}

}
