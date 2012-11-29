package com.atul.webusers.business.impl;

import org.springframework.stereotype.Service;

import com.atul.webusers.business.api.IPersonalBanking;

@Service("bankAccount")
public class BankAccount implements IPersonalBanking {

	public void showAccountType() {
		System.out.println("Inside the BankAccount");
	}

}
