package com.cts.practise.msms.service;

import java.util.List;

import com.cts.practise.msms.model.Customer;

public interface CustomerService {
	public void createCustomer(Customer customer);

	public List<Customer> getCustomers();

	public Customer getCustomerById(Long id);

	public void updateCustomer(Customer customer);

	public void deleteCustomerById(Long id);
}
