package com.guestbook.domain;

import org.springframework.web.multipart.MultipartFile;

public class PriceDTO {

	private int num;
	private String name;
	private int price;
	private String url;
	private String bview;
	private MultipartFile murl;
	
	
	
	public MultipartFile getMurl() {
		return murl;
	}
	public void setMurl(MultipartFile murl) {
		this.murl = murl;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBview() {
		return bview;
	}
	public void setBview(String bview) {
		this.bview = bview;
	}
	
	
	
}
