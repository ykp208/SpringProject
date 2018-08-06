package com.guestbook.book;

import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.guestbook.domain.PriceDTO;
import com.guestbook.service.PriceServiceImpl;

@Controller
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private PriceServiceImpl ps;
	
	@RequestMapping(value="/productList" )
	public String productList(Model mo) {
		
		mo.addAttribute("pdto",ps.priceList());
		
		
		return "Product/ProductList";
	}
	@RequestMapping(value="/pView",method=RequestMethod.POST)
	
	public String pView(Model mo,String num) {
		
		PriceDTO pdto = ps.priceView(Integer.parseInt(num));
		mo.addAttribute("pdto",pdto);
		
		return "Product/ProductView";
	}
	
	@RequestMapping(value="/pUpdata" ,method=RequestMethod.POST)
	public String pUpdata(PriceDTO pdto) {
		
			ps.priceupdate(pdto);
			
		return "redirect:productList";
	}
	@RequestMapping(value="/pInsert" ,method=RequestMethod.POST)
	public String pInsert(PriceDTO pdto) {
		
			ps.priceInsert(pdto);
		
		return "redirect:productList";
	}
	@RequestMapping(value="/pInsertpage")
	public String pInsertpage() {
		
		return "Product/PInsert";
	}
	@RequestMapping(value="/pDelete")
	public String pDelete(int num) {
		
		ps.priceDelete(num);
		
		return "redirect:productList";
	}
}
