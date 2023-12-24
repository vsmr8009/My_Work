package com.cts.practise.msms.dto;

public class SaleItemDto {

	private Long medicineId;
	private Long customerId;
	private Integer quantity;

	public SaleItemDto() {
		super();
	}

	public SaleItemDto(Long medicineId, Long customerId, Integer quantity) {
		super();
		this.medicineId = medicineId;
		this.customerId = customerId;
		this.quantity = quantity;
	}

	public Long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
