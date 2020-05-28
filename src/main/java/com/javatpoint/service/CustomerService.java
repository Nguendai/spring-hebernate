package com.javatpoint.service;

import org.springframework.stereotype.Service;

import com.javatpoint.beans.Customer;
import com.util.generic.service.GenericService;
@Service
public interface CustomerService extends GenericService<Customer, Integer> {

}
