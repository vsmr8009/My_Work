package com.cts.practise.msms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.practise.msms.dao.CustomerDao;
import com.cts.practise.msms.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Override
	public void createCustomer(Customer customer) {
		customerDao.saveCustomer(customer);

	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.loadCustomers();
	}

	@Override
	public Customer getCustomerById(Long id) {
		return customerDao.loadCustomer(id);
	}

	@Override
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);

	}

	@Override
	public void deleteCustomerById(Long id) {
		Customer customer = customerDao.loadCustomer(id);
		customerDao.deleteCustomer(customer);

	}
}
