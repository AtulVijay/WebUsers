package com.atul.webusers.business.impl;

import org.springframework.stereotype.Service;

import com.atul.webusers.business.api.IPersonalBanking;

@Service("debitCard")
public class DebitCard implements IPersonalBanking {

	public void showAccountType() {
		System.out.println("Inside the DebitCard");
	}

}
