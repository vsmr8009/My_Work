package com.cts.practise.msms.dao;

import java.util.List;

import com.cts.practise.msms.model.Customer;

public interface CustomerDao {
	public void saveCustomer(Customer customer);

	public List<Customer> loadCustomers();

	public Customer loadCustomer(Long id);

	public void updateCustomer(Customer customer);

	public void deleteCustomer(Customer customer);
}
