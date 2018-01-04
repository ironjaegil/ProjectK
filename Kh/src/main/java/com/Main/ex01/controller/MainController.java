package com.Main.ex01.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex01")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@RequestMapping("/doA.do")
	public void doA() {
		logger.info("doA 실행.");
	}
	
	@RequestMapping("/doB.do")
	public void doB() {
		logger.info("doB 실행.");
	}
}
