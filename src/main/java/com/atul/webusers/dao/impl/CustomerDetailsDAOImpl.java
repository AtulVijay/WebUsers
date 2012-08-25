package com.atul.webusers.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atul.webusers.dao.api.CustomerDetailsDAO;
import com.atul.webusers.domain.CustomerDetails;

@Repository("cusomerDetailsDAO")
public class CustomerDetailsDAOImpl implements CustomerDetailsDAO {

	@Autowired 
	SessionFactory sessionfactory;
	
	@Transactional
	public void addCustomerDetails(CustomerDetails custDetails) {
		sessionfactory.getCurrentSession().save(custDetails);
	}

}
