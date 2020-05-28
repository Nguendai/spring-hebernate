package com.javatpoint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javatpoint.beans.Customer;
import com.javatpoint.service.container.ServiceContainer;

@Controller
public class CustomerController {

	@RequestMapping(value= {"/customer-list"})
	public String listCustomer(Model model) throws Exception {
		List<Customer> listCustomer = ServiceContainer.customerService.findAll();
		
		model.addAttribute("listCustomer",listCustomer);
		return "customer-list";
		
	}
}
