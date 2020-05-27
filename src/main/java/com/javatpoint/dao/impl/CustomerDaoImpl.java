package com.javatpoint.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.javatpoint.beans.Customer;
import com.javatpoint.dao.CustomerDao;
import com.util.generic.dao.impl.GenericDaoImpl;



@Repository
public class CustomerDaoImpl extends GenericDaoImpl<Customer, Integer> implements CustomerDao {
	private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

}
