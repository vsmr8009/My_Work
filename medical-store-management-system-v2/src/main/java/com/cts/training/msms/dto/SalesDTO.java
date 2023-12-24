package com.cts.training.msms.dto;

import java.util.List;

public class SalesDTO {
	
	private String customerPhone;
	
	private List<SaleItemDTO> saleItemDTO;
	
	public String getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}
	public List<SaleItemDTO> getSaleItemDTO() {
		return saleItemDTO;
	}
	public void setSaleItemDTO(List<SaleItemDTO> saleItemDTO) {
		this.saleItemDTO = saleItemDTO;
	}	
}
