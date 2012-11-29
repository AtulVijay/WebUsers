package com.atul.webusers.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atul.webusers.business.api.ICustomer;
import com.atul.webusers.dao.api.CustomerDetailsDAO;
import com.atul.webusers.domain.CustomerDetails;

@Service("customerBean")
public class CustomerBean implements ICustomer {

	CustomerDetailsDAO cusomerDetailsDAO;
	
	@Autowired
	public void setCusomerDetailsDAO(CustomerDetailsDAO cusomerDetailsDAO){
		this.cusomerDetailsDAO=cusomerDetailsDAO;
	}
	
	
	public void addCustomer() {
		CustomerDetails  custDetails = prepareCustomer();
		cusomerDetailsDAO.addCustomerDetails(custDetails);
	}
	
	
	
	private CustomerDetails prepareCustomer(){
		CustomerDetails  custDetails = new CustomerDetails();
		custDetails.setAddress1("703/A-5(Prabhav)");
		custDetails.setAddress2("Ghodbunder Road");
		custDetails.setArea("Thane West");
		custDetails.setCity("Mumbai");
		custDetails.setEmail("atulvijay.09@gmail.com");
		custDetails.setFirstName("Atul");
		custDetails.setLastName("Vijay");
		custDetails.setMobile(new Long("9820383779"));
		custDetails.setPinCode(new Long("400607"));
		custDetails.setState("Maharashtra");
		custDetails.setCity("Mumbai");
		return custDetails;
	}
	
	

}
