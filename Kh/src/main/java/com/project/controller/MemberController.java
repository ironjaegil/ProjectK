package com.project.controller;
 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.cmd.MemberVO;
import com.project.service.MemberService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
 
/**
 * Handles requests for the application home page.
 */
@Controller
public class MemberController {
    
    private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
    
    @Autowired
    //@Inject
    private MemberService service;
    
    /**
     * Simply selects the home view to render by returning its name.
     */
//    @RequestMapping(value = "/home.do", method = RequestMethod.GET)
//    public String home(Locale locale, Model model) throws Exception{
// 
//        logger.info("home");
//        
//        List<MemberVO> memberList = service.selectMember(vo);
//        
//        model.addAttribute("memberList", memberList);
// 
//        return "home";
//    }
    
//	@RequestMapping("/grid.do")
//    public ModelAndView Grid(MemberVO memberVO) {
//		ModelAndView mav = new ModelAndView();
//		
//		logger.info("Ex_jqGrid");
//		
//		List<MemberVO> memberList = service.selectMember();
//		Map resultMap = new HashMap();
//		for (int i = 0; i < memberList.size(); i++) {
//			resultMap.put("ID", memberList);
//			resultMap.put("PWD", memberList);
//			resultMap.put("NAME", memberList);
//			resultMap.put("DATE", memberList);
//		}
//		logger.info("memberList의 값 : " + memberList);
//		logger.info("resultMap의 값 : " + resultMap);
//		logger.info("memberList(mav)의 값 : " + mav.toString());
//		mav.addObject(resultMap);
//		mav.setViewName("Ex_jqGrid");
//        return mav;  
//    }
	
	  @RequestMapping(value = "/grid.do")
	  public ModelAndView Grid(@ModelAttribute("cmd") MemberVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		  ModelAndView mav = new ModelAndView(); 
		  List<MemberVO> rtnList = service.selectMember(vo);
		  JSONArray sendJson = new JSONArray();
		  
		  for (int i = 0; i < rtnList.size(); i++) {
			  JSONObject json = new JSONObject();
			  json.put("USER_ID", rtnList.get(i).getUSER_ID());
			  json.put("ID", rtnList.get(i).getID());
			  json.put("PWD", rtnList.get(i).getPWD());
			  json.put("NAME", rtnList.get(i).getNAME());
			  json.put("INDATE", rtnList.get(i).getINDATE());
		      sendJson.add(json);
		  }
	      
	      //view에서 json형태로 넘어가는지 확인
//	      PrintWriter pw = response.getWriter();
//	      pw.println(jsonList);
//	      pw.flush();
//	      pw.close();
	      mav.addObject("rtnList", rtnList);
	      mav.addObject("rows", sendJson);
	      mav.setViewName("/Ex_jqGrid");
	      return mav;
	  }
}
