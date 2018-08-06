package com.guestbook.service;

import java.util.List;

import com.guestbook.domain.PriceDTO;

public interface PriceService {

	//리스트
	public List<PriceDTO> priceList();
	//상품등록
	public void priceInsert(PriceDTO pdto);
	//상품수정
	public void priceupdate(PriceDTO pdto);
	//삭제
	public void priceDelete(int num);
	//view
	public PriceDTO priceView(int num);
}
