package com.guestbook.persistence;

import java.util.Map;

import com.guestbook.domain.PriceDTO;

public class SearchNum {

	public static String searchNum(Map<String, Object> params) {
		System.out.println(params.get("type"));
		
		System.out.println(params.get("keyword"));
		
		
		String searchFront =
				"select * " + " from price " + " where 1 = 1";
		
		if(params.get("type").equals("name")) {
			searchFront += " and name like '%'||#{keyword}||'%' ";
		}
		
		if(Integer.parseInt(params.get("keyword")).equals("price")) {
			searchFront += " and price = #{keyword} ";
		}
		
		return searchFront;
	}
}
