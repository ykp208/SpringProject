package com.guestbook.persistence;

import java.util.List;

import com.guestbook.domain.PriceDTO;

public interface PriceDAO {

		//����Ʈ
		public List<PriceDTO> priceList(String sqlId);
		//��ǰ���
		public void priceInsert(String sqlId,PriceDTO pdto);
		//��ǰ����
		public void priceupdate(String sqlId,PriceDTO pdto);
		//����
		public void priceDelete(String sqlId,int num);
		//view
		public PriceDTO priceView(String sqlId,int num);
}
