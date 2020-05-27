package com.javatpoint.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatpoint.beans.Customer;
import com.javatpoint.dao.CustomerDao2;
@Service
@Transactional
public class CustomerService2 {
	@Autowired
	private CustomerDao2 customerDAO;

	public List<Customer> findAll() {
		return customerDAO.findAll();
	}

	public Customer findById(int id) {
		return customerDAO.findById(id);
	}

	public void save(Customer customer) {
		// validate business
		customerDAO.save(customer);
	}

	public void update(Customer customer) {
		// validate business
		customerDAO.update(customer);
	}

	public void delete(Customer custome) {
		// validate business
		customerDAO.delete(custome);
	}

}
