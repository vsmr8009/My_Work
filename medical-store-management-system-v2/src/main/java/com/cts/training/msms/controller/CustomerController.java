package com.cts.training.msms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.msms.dto.CustomerDTO;
import com.cts.training.msms.entity.Customer;
import com.cts.training.msms.service.CustomerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/msms/v2")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	//Get list of customers
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomers();
	}
	
	//Create a customer
	@PostMapping("/customers")
	public ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customer) {
			Customer saveCustomer = customerService.saveCustomer(customer);
			return ResponseEntity.ok(saveCustomer);

	}
	
	
	//Get a customer by id
	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer customer = customerService.getCustomerById(id);
		return ResponseEntity.ok(customer);		
	}
	
	//Update a customer by id
	@PutMapping("/customers/{id}")
	public ResponseEntity<Customer> updateCustomerById(@Valid @PathVariable Long id, @RequestBody Customer customer){
		Customer updateCustomer = customerService.updateCustomer(id, customer);	
		return ResponseEntity.ok(updateCustomer);
	}
	
	//Delete a customer by id
	@DeleteMapping("/customers/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteCustomerById(@PathVariable Long id){
		customerService.deleteCustomer(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Customer Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	//Get a customer by name
	@GetMapping("/customers/name/{name}")
	public Customer getCustomerByName(@PathVariable String name) {
		return customerService.getCustomerByName(name);
		
	}
	
	@GetMapping("/customers/phone/{phone}")
	public Customer getCustomerByPhone(@RequestBody String phone) {
		return customerService.getCustomerByPhoneNumber(phone);
	}
	
	@GetMapping("/customers/validate")
	public Customer validateCustomer(@RequestBody CustomerDTO customerDTO) {
		Customer findCustomer = customerService.getCustomerByUsernameAndPassword(customerDTO.getUsername(), customerDTO.getPassword());		
		return findCustomer;
	}
}	
