package com.guestbook.persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.guestbook.domain.PriceDTO;


@Repository
public class PriceDAOImpl implements PriceDAO{

	@Autowired
	private SqlSession session;
	
	private static final String namespace= "com.guestbook.mappers.ProductAccount";
	
	@Override
	public List<PriceDTO> priceList(String sqlId) {
		// TODO Auto-generated method stub
		return session.selectList(namespace+sqlId);
	}

	@Override
	public void priceInsert(String sqlId, PriceDTO pdto) {
		session.insert(namespace+sqlId, pdto);
		
	}

	@Override
	public void priceupdate(String sqlId, PriceDTO pdto) {
		session.update(namespace+sqlId, pdto);
		
	}

	@Override
	public void priceDelete(String sqlId, int num) {
		session.delete(namespace+sqlId, num);
		
	}

	@Override
	public PriceDTO priceView(String sqlId, int num) {
		
		return session.selectOne(namespace+sqlId, num);
	}

}
