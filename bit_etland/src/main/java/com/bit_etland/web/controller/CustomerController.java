package com.bit_etland.web.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.bit_etland.web.domain.CustomerDTO;
import com.bit_etland.web.service.CustomerService;
@SessionAttributes("user")
@Controller
@RequestMapping("/customer")
public class CustomerController {
	static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	@Autowired CustomerDTO cust;
	/* @Autowired ImageService imgservice; */
	@Autowired CustomerService customerService;
	/* @Autowired ImageDTO img; */
	
	@RequestMapping(value = "/signin" , method = RequestMethod.POST)
	public String signin(@ModelAttribute CustomerDTO param,Model session) {
		logger.info("\n --------- MemberController  {} !! ----------","signin"); 
		System.out.println("로그인 전 :" +param.toString());
		cust = customerService.retriveCustomer(param);
		System.out.println("로그인 후 결과 :"+cust);
		/* session.setAttribute("img",img); */
		if(cust != null) {
			session.addAttribute("user", cust);
		}
		return (cust != null) ?
				"public:customer/detail.tiles"
					:				 
				"public:home/main.tiles";
	}
	
	@RequestMapping(value = "/detail")
	public String detail(@RequestParam("customerID")String customerID, Model model) {
		logger.info("\n --------- MemberController  {} !! ----------","signin"); 
		System.out.println("조회 파라미터"+customerID);
		cust.setCustomerID(customerID);
		cust = customerService.retriveCustomer(cust);
		model.addAttribute("cust",cust);
		return "public:customer/detail.tiles";
		
	}
	
	@RequestMapping(value = "/update" , method = RequestMethod.POST)
	public String update(@ModelAttribute CustomerDTO param,
						Model session,
						RedirectAttributes red
										 ) {
		logger.info("\n --------- MemberController  {} !! ----------","update"); 
		System.out.println("param 값:"+param);
		customerService.modfyCustomer(param);
		cust = customerService.retriveCustomer(param);
		session.addAttribute("user",cust);
		red.addAttribute("customerID",param.getCustomerID());
		System.out.println("업데이트 후 결과 :"+customerService.retriveCustomer(param));
		return  "redirect:/customer/detail";
	}
}
	
	


