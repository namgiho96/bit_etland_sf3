package com.bit_etland.web.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bit_etland.web.proxy.ContextProxy;

@Controller
public class HomeController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired ContextProxy pxy;
	@RequestMapping("/")
	public String home(HttpSession session,HttpServletRequest request) {
		logger.info("\n --------- Welcome {} !! ----------","홈컨트롤 들어옴"); //시스템아웃 기능!
		pxy.setContext();
		return "index.jsp";
	}
	
	@RequestMapping("/move/{dir}/{page}")
	public String move(
			@PathVariable String dir,
			@PathVariable String page) {
		logger.info("\n --------- move to  {} !! ----------","무브 들어온다"+dir+"/"+page); 
		return String.format("public:%s/%s.tiles",dir,page);
	}
}
