package com.bit_etland.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes({"ctx","css","js","img","time"})
@Controller
public class HomeController {
	static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String home(HttpSession session,HttpServletRequest request) {
		logger.info("\n --------- Welcome {} !! ----------","홈컨트롤 들어옴"); //시스템아웃 기능!
		String ctx = request.getContextPath();
		session.setAttribute("ctx",ctx);
		session.setAttribute("css",ctx +"/resources/css/");
		session.setAttribute("js",ctx +"/resources/js/");
		session.setAttribute("img",ctx +"/resources/img/");
		session.setAttribute("time", new SimpleDateFormat("yyyy년-MM월-dd일 hh:mm").format(new Date()));
		return "public:home/main.tiles";
	}
	
	@RequestMapping("/move/{dir}/{page}")
	public String move(
			@PathVariable String dir,
			@PathVariable String page) {
		logger.info("\n --------- move to  {} !! ----------","무브 들어온다"+dir+"/"+page); 
		return String.format("public:%s/%s.tiles",dir,page);
	}
}
