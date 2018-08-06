package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.PriceDTO;

public interface PriceService {

	//����Ʈ
	public List<PriceDTO> priceList();
	//��ǰ���
	public void priceInsert(PriceDTO pdto);
	//��ǰ����
	public void priceupdate(PriceDTO pdto);
	//����
	public void priceDelete(int num);
	//view
	public PriceDTO priceView(int num);
}
