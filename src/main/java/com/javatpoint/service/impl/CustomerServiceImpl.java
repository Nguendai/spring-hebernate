package com.javatpoint.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.javatpoint.beans.Customer;
import com.javatpoint.dao.CustomerDao;
import com.javatpoint.service.CustomerService;
import com.util.generic.dao.GenericDao;
import com.util.generic.service.impl.GenericServiceImpl;
@Service("customerService")
@Transactional
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Integer> implements CustomerService {
	private CustomerDao dao;

	public CustomerServiceImpl() {
		super();
	}
	@Autowired
	public CustomerServiceImpl(@Qualifier("reasonDaoImpl") GenericDao<Customer, Integer> genericDao) {
		super(genericDao);
		this.dao = (CustomerDao) genericDao;
	}
	
}