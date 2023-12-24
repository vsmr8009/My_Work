package com.cts.practise.msms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.practise.msms.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		hibernateTemplate.save(customer);
		
	}

	@Override
	public List<Customer> loadCustomers() {
		return hibernateTemplate.loadAll(Customer.class);
	}

	@Override
	public Customer loadCustomer(Long id) {
		return hibernateTemplate.get(Customer.class, id);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		hibernateTemplate.update(customer);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(Customer customer) {
		hibernateTemplate.delete(customer);
		
	}

}
