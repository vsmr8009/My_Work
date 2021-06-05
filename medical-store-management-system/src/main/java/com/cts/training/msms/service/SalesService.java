package com.cts.training.msms.service;

import java.util.List;
import java.util.Optional;

import com.cts.training.msms.dto.SalesDTO;
import com.cts.training.msms.entity.Customer;
import com.cts.training.msms.entity.Sales;

public interface SalesService {
	
	public Sales addSale(SalesDTO salesDTO);

	public List<Sales> getSales();
	
	public Optional<Sales> getById(Long id);

}
