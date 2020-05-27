package com.javatpoint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javatpoint.beans.Customer;
import com.javatpoint.service.CustomerService2;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService2 customerService2;
	@RequestMapping(value= {"/customer-list"})
	public String listCustomer(Model model) throws Exception {
		List<Customer> listCustomer = customerService2.findAll();
		
		model.addAttribute("listCustomer",listCustomer);
		return "customer-list";
		
	}
}
