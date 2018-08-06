package com.guestbook.persistence;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.MemberDTO;

@Repository
public class GuestDAOImpl implements GuestDAO{

	@Autowired
	private SqlSession session;
	
	private static final String namespace= "com.guestbook.mappers.GuestAccount";
	
	@Override
	public void guestInsert(String sqlId, GuestDTO gdto) {
		session.insert(namespace+sqlId, gdto);
		
	}

	@Override
	public List<GuestDTO> guestList(String sqlId, HashMap<String, Object> hm) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+sqlId, hm);
	}

	@Override
	public GuestDTO guestView(String sqlId, int num) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+sqlId, num);
	}

	@Override
	public void guestDelete(String sqlId, int num) {
		// TODO Auto-generated method stub
		
		session.delete(namespace+sqlId, num);
	}

	@Override
	public int guestcount(String sqlId, HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+sqlId, hm);
	}

	@Override
	public MemberDTO login(String sqlId, String userid) {
		// TODO Auto-generated method stub
		return session.selectOne(namespace+sqlId, userid);
	}

}
