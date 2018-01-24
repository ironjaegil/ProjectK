package com.Main.ex01.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.codehaus.jackson.map.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.project.cmd.MemberVO;
import com.project.service.MemberService;

@Controller
@RequestMapping("/ex01")
public class MainController2 {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController2.class);
    
	@Inject
    private MemberService service;
    
    
	@RequestMapping("/doD.do") 
	public String doD(Model model) {
		
		logger.info("doD 실행.");
		
		MemberVO member = new MemberVO();
		//member.setUserid("userid-01");
		//member.setUserpw("userpw-01");
		
		model.addAttribute("member", member);
		
		logger.info("MemberVO" + member.toString());
		
		return "ex01/data";
		
	}
	
	@RequestMapping("/doE.do")
    public String doE(Model model) {
        
        logger.info("doE 실행.");
        
        Map<String,String> map = new HashMap<String,String>();
        map.put("userid", "userid-02");
        map.put("userpw", "userpw-02");
        
        model.addAttribute("map", map);
    
        return "ex01/data";  
    }
	

}
