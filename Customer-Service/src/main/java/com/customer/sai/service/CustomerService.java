package com.customer.sai.service;

import java.util.List;

import com.customer.sai.entity.Customer;
import com.customer.sai.exceptioncontroller.NotFoundException;


public interface CustomerService {
	
	public List<Customer> getCustomers(String city);
	
	public Customer getCustomerById(Long CustomerId);
	
	public Customer addCustomer(Customer customer);
	
	public Customer updateCustomer(Long customerId, Customer customer) throws NotFoundException, NotFoundException;
	
	public Customer updateCustomerName(Long customerId, String name);
	
	public Customer deleteCustomer(Long customerId);
	
	public String checkStatus(Long customerId);

}