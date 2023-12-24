package com.cts.training.msms.service.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.msms.dto.SaleItemDTO;
import com.cts.training.msms.dto.SalesDTO;
import com.cts.training.msms.entity.Customer;
import com.cts.training.msms.entity.SaleItem;
import com.cts.training.msms.entity.Sales;
import com.cts.training.msms.exception.ResourceNotFoundException;
import com.cts.training.msms.repository.CustomerRepository;
import com.cts.training.msms.repository.SalesRepository;
import com.cts.training.msms.service.SaleItemService;
import com.cts.training.msms.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService {
	
	@Autowired
	private SalesRepository salesRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private SaleItemService saleItemService;
	
	@Override
	public Sales addSale(SalesDTO salesDTO) {
		Customer customer = customerRepository.findByPhone(salesDTO.getCustomerPhone());
		if(customer.getPhone().equals(salesDTO.getCustomerPhone())) {
		Sales sales = new Sales();
		sales.setCustomer(customer);
		Double amount = 0.0;
		Integer quantity = 0;
		List<SaleItem> saleItems =  new ArrayList<>();
		List<SaleItemDTO> saleItemDTO = salesDTO.getSaleItemDTO();
		for(int i=0; i<saleItemDTO.size(); i++) {
			SaleItem saleItem = saleItemService.addSaleItem((saleItemDTO.get(i)));
			saleItems.add(saleItem);
			amount += saleItem.getAmount();
			quantity += saleItem.getQuantity();
		}
	    sales.setSaleItem(saleItems);
		sales.setAmount(amount);			
		sales.setQuantity(quantity);
		sales.setDate(LocalDateTime.now());
		Sales saveSales = salesRepository.save(sales);
		return saveSales;
		}
		else {
			throw new ResourceNotFoundException("Check Customer Details");
		}
	}

	@Override
	public List<Sales> getSales() {
		List<Sales> salesList = salesRepository.findAll();
		return salesList;
	}

	@Override
	public Optional<Sales> getById(Long id) {
		return salesRepository.findById(id);
	}
	

}
