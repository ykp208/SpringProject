package com.guestbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guestbook.domain.PriceDTO;
import com.guestbook.persistence.PriceDAO;
import com.guestbook.persistence.PriceDAOImpl;


@Service
public class PriceServiceImpl implements PriceService{

	@Autowired
	private PriceDAOImpl pdao;

	
	@Override
	public List<PriceDTO> priceList() {
		// TODO Auto-generated method stub
		return pdao.priceList(".priceListData");
	}

	@Override
	public void priceInsert(PriceDTO pdto) {
		pdao.priceInsert(".priceInsertData", pdto);
		
	}

	@Override
	public void priceupdate(PriceDTO pdto) {
		pdao.priceupdate(".priceUpData", pdto);
		
	}

	@Override
	public void priceDelete(int num) {
		pdao.priceDelete(".priceDeleteData", num);
		
	}

	@Override
	public PriceDTO priceView(int num) {
		
		return pdao.priceView(".priceViewData", num);
	}
	
	

}
