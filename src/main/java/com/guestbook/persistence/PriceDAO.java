package com.guestbook.persistence;

import java.util.List;

import com.guestbook.domain.PriceDTO;

public interface PriceDAO {

		//리스트
		public List<PriceDTO> priceList(String sqlId);
		//상품등록
		public void priceInsert(String sqlId,PriceDTO pdto);
		//상품수정
		public void priceupdate(String sqlId,PriceDTO pdto);
		//삭제
		public void priceDelete(String sqlId,int num);
		//view
		public PriceDTO priceView(String sqlId,int num);
}
