package com.atul.webusers.business.impl;

import org.springframework.stereotype.Service;

import com.atul.webusers.business.api.IPersonalBanking;

@Service("creditCard")
public class CreditCard implements IPersonalBanking {

	public void showAccountType() {
		System.out.println("Inside the CreditCard");
	}
}
