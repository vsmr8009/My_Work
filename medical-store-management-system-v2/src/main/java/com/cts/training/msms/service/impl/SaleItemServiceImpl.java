package com.cts.training.msms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.msms.dto.SaleItemDTO;
import com.cts.training.msms.entity.Medicine;
import com.cts.training.msms.entity.SaleItem;
import com.cts.training.msms.exception.ResourceNotFoundException;
import com.cts.training.msms.repository.MedicineRepository;
import com.cts.training.msms.repository.SaleItemRepository;
import com.cts.training.msms.service.MedicineService;
import com.cts.training.msms.service.SaleItemService;

@Service
public class SaleItemServiceImpl implements SaleItemService {

	@Autowired
	private SaleItemRepository saleItemRepository;

	@Autowired
	private MedicineRepository medicineRepository;

	@Autowired
	private MedicineService medicineService;

	@Override
	public SaleItem addSaleItem(SaleItemDTO saleItemDTO) {
		SaleItem saleItem = new SaleItem();
		Medicine medicine = medicineService.getMedicineById(saleItemDTO.getMedicineId());
		if (medicine.getQuantity() < saleItemDTO.getQuantity()) {
			throw new ResourceNotFoundException("Enough Quantity not availble");
		} else {
			saleItem.setMedicine(medicine);
			saleItem.setQuantity(saleItemDTO.getQuantity());
			saleItem.setAmount((double) (saleItemDTO.getQuantity() * medicine.getPrice()));
			SaleItem saveSaleItem = saleItemRepository.save(saleItem);
			medicineRepository.getQuantityAfterOrder(medicine.getId(), saleItemDTO.getQuantity());
			return saveSaleItem;
		}
	}

}
