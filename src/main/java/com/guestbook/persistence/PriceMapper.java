package com.guestbook.persistence;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.guestbook.domain.PriceDTO;


@Repository
public interface PriceMapper {

	@Delete("delete from price where num = #{num}")
	public void pricedelete(
			@Param("num") int num
			);
	
	@SelectProvider(type=SearchNum.class,method="searchNum")
	public List<PriceDTO> pricesearch(
			@Param("type") String type,
			@Param("keyword") String keyword
			);
}
