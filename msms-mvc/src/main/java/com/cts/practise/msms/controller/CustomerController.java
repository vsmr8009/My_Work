package com.cts.practise.msms.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.practise.msms.model.Customer;
import com.cts.practise.msms.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {

		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);

		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping(value = "/new-customer", method = RequestMethod.GET)
	public String addCustomerForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping(value = "/add-customer", method = RequestMethod.POST)
	public String createCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "customer-form";
		} else {
			customerService.createCustomer(customer);
			return "redirect:/customers";
		}
	}

	@RequestMapping("/customers")
	public String getCustomer(Model model) {
		List<Customer> customers = customerService.getCustomers();
		model.addAttribute("customers", customers);
		return "customer-list";
	}

	@RequestMapping("/edit-customer/{id}")
	public String updateCustomerform(@PathVariable("id") Long id, Model model) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer", customer);
		return "update-customer-form";
	}

	@RequestMapping(value = "/update-customer", method = RequestMethod.POST)
	public String updateCustomer(@ModelAttribute Customer customer) {
		customerService.updateCustomer(customer);
		return "redirect:/customers";
	}

	@RequestMapping("/delete-customer/{id}")
	public String deleteCustomer(@PathVariable("id") Long id) {
		customerService.deleteCustomerById(id);
		return "redirect:/customers";
	}
}
