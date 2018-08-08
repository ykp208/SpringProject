package com.guestbook.book;

import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.RespectBinding;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.guestbook.domain.GuestDTO;
import com.guestbook.domain.Id_Pwd_hash;
import com.guestbook.domain.MemberDTO;
import com.guestbook.service.GuestService;
import com.guestbook.service.GuestServiceImpl;

/**
 * Handles requests for the application home page.
 */

@SessionAttributes("userid")

@Controller
public class GuestController {
	
	private static final Logger logger = LoggerFactory.getLogger(GuestController.class);
	
	@Autowired
	private GuestServiceImpl service;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		return "guestbook/login";
	}
	
	@RequestMapping(value="/guestlogin_hash" , method=RequestMethod.POST)
	@ResponseBody
	public int guestlogin_hash() {
		
		
		
		return 10; 
	}
	
	
	@RequestMapping(value="/guestlogin",method = RequestMethod.POST )
	public String guestlogin(int userid, int pwd, Model mo) {
		
		 String tt = Character.toString((char)(userid/10));
		 String ttt = Character.toString((char)(pwd/10));
		MemberDTO mdto = new MemberDTO();
			mdto.setUserid(tt);
			mdto.setPwd(ttt);
		System.out.println("userid :"+mdto.getUserid());
		System.out.println("pwd :"+mdto.getPwd());
			
			
		MemberDTO mm = service.login(mdto.getUserid());
		String url="";
		
		
		if(mm.getPwd().equals(mdto.getPwd())) {
			
			url ="guestbook/guestInsert";
			mo.addAttribute("userid",mdto.getUserid());
			mo.addAttribute("login",mm);
		}else {
			
			url="guestbook/login";
			mo.addAttribute("str","무언가 잘못되었느니라");
		}
	
		return url;
	}
	
	@RequestMapping(value="/list.do")
	public String getSearch(HttpServletRequest request,HttpServletResponse response,Model mo)  {
		
		
		
		String  pageNum =request.getParameter("pageNum")==null?"1":request.getParameter("pageNum");
		String field = request.getParameter("field")==null?"":request.getParameter("field");
		String word =request.getParameter("word")==null?"":request.getParameter("word");
		
		
		
		
		int currentPage = Integer.parseInt(pageNum);//현제 페잊;
		int pageSize =5;
		int starRow=(currentPage-1)*pageSize+1;
		int endRow=currentPage*pageSize;
		
		
		System.out.println(field+":field"+word+"word:"+starRow+"starRow:"+endRow+"endRow");
		
		
		
		
		//ArrayList<GuestDTO> arr= dao.list();
		List<GuestDTO> arr= service.guestList(field,word,starRow,endRow);
		int count= service.guestcount(field, word);
		
		int totpage=count/pageSize+(count/pageSize==0?0:1);
		int blockpage=3;
		int startpage=((currentPage-1)/blockpage)*blockpage+1;
		int endpage=startpage+blockpage-1;
		if(endpage >totpage)endpage=totpage;
			
		mo.addAttribute("startpage", startpage);
		mo.addAttribute("endpage", endpage);
		mo.addAttribute("currentPage", currentPage);
		mo.addAttribute("blockpage", blockpage);
		mo.addAttribute("totpage", totpage);
		
		
		
		
		mo.addAttribute("s", count);
		mo.addAttribute("a", arr);
		
		
		return "guestbook/list";
	}
	
	@RequestMapping(value="/guestview.do" ,method=RequestMethod.POST ,produces="application/json")
	@ResponseBody
	public HashMap<String, Object> guestview(int num,Model mo) {
		
		GuestDTO gdto = service.guestView(num);
		HashMap<String, Object> hm = new HashMap<>();
		hm.put("num", gdto.getNum());
		hm.put("name", gdto.getName());
		hm.put("content", gdto.getContent());
		hm.put("grade", gdto.getGrade());
		hm.put("created", gdto.getCreated());
		hm.put("ipaddr", gdto.getIpaddr());
		
		return hm;
	}
	
	@RequestMapping(value="/delete.do")
	public String guestDelete(int num) {
		
		service.guestDelete(num);
		
		return "redirect:list.do";
	}
	
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String guestinsert(GuestDTO gdto,HttpServletRequest req){
		
		gdto.setIpaddr(req.getRemoteAddr());
		service.guestInsert(gdto);
		
		return "redirect:list.do";
	}
	@RequestMapping(value="/memopage")
	public String memopage() {
		
		return "guestbook/memopage";
	}
	
	
}
