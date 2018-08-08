package com.guestbook.book;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;
import javax.xml.ws.BindingType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.guestbook.domain.PriceDTO;
import com.guestbook.persistence.PriceMapper;
import com.guestbook.service.PriceServiceImpl;



@Controller
public class ProductController {
	
	
	@Resource(name="uploadPath")
	private String uploadPath;

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private PriceServiceImpl ps;
	
	@Autowired
	private PriceMapper pm;
	
	@RequestMapping(value="/productList" )
	public String productList(String type, String keyword, Model mo) {

		if(type==(null)) type="a";
		if(keyword==(null)) keyword="a";

		System.out.println("type"+type+", keyword"+keyword);
		mo.addAttribute("pdto",pm.pricesearch(type, keyword));
		
		
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
	public String pInsert(PriceDTO pdto, Model mo) throws Exception{
		
		System.out.println("안들어와진다.");
		System.out.println("여기"+pdto.getMurl());
		
		
		MultipartFile file = pdto.getMurl();
		logger.info("originalName:"+file.getOriginalFilename());
		logger.info("size:"+file.getSize());
		logger.info("contenType:"+file.getContentType());
	
		String savedName = uploadFile(file.getOriginalFilename(), file.getBytes());
		
			pdto.setUrl(savedName);
			ps.priceInsert(pdto);
		
		return "redirect:productList";
	}
	
	

	
	private String uploadFile(String originalName, byte[] fileData) throws Exception{
		
		UUID uid = UUID.randomUUID();
		String savedName = uid.toString() + "_" + originalName;
		File target = new File(uploadPath,savedName);
		FileCopyUtils.copy(fileData, target);
		
		return savedName;
	}	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/pInsertpage")
	public String pInsertpage() {
		
		return "Product/PInsert";
	}

	
	@RequestMapping(value="/pDelete")
	public String pDelete(int num) {
		
		pm.pricedelete(num);
		
		return "redirect:productList";
	}
	
}
