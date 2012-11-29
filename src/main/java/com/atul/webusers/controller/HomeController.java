package com.atul.webusers.controller;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atul.webusers.business.api.ICustomer;
import com.atul.webusers.business.api.IPersonalBanking;
import com.atul.webusers.dao.api.CustomerDetailsDAO;
import com.atul.webusers.domain.Item;
import com.atul.webusers.domain.Order;
/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	@Qualifier("customerBean")
	ICustomer customerBean;
	
	@Autowired
	@Qualifier("bankAccount")
	IPersonalBanking bankAccount;

	@Autowired
	@Qualifier("creditCard")
	IPersonalBanking creditCard;

	
	@Autowired
	@Qualifier("debitCard")
	IPersonalBanking debitCard;

	
	/*
	@Autowired
	public void setCustomerBean(ICustomer customerBean){
		this.customerBean=customerBean;
	}
	*/
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String welcomePage(Locale locale, Model model) throws Exception{
		logger.info("Wecome Atul Vijay!!! the client locale is "+ locale.toString());
		
		showAccountType(bankAccount);
		showAccountType(creditCard);
		showAccountType(debitCard);
			
		model.addAttribute("message", "Welcome Atul Vijay!! Finally You have done it.XXX" );
		customerBean.addCustomer();
		return "WelCome";
	}
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "WelCome.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	private void showAccountType(IPersonalBanking x){
		x.showAccountType();
	}
	
}
