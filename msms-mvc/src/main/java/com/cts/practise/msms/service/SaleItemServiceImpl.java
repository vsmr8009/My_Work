package com.cts.practise.msms.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.practise.msms.dao.CustomerDao;
import com.cts.practise.msms.dao.MedicineDao;
import com.cts.practise.msms.dao.SaleItemDao;
import com.cts.practise.msms.dto.SaleItemDto;
import com.cts.practise.msms.model.Customer;
import com.cts.practise.msms.model.Medicine;
import com.cts.practise.msms.model.SaleItem;

@Service
public class SaleItemServiceImpl implements SaleItemService {
	@Autowired
	private SaleItemDao saleItemDao;
	@Autowired
	private MedicineDao medicineDao;
	@Autowired
	private CustomerDao customerDao;
	@Override
	public void addSale(SaleItemDto saleItemDto) {
		SaleItem saleItem = new SaleItem();
		Medicine medicine = medicineDao.loadMedicine(saleItemDto.getMedicineId());
		Customer customer = customerDao.loadCustomer(saleItemDto.getCustomerId());
		saleItem.setMedicine(medicine);
		saleItem.setCustomer(customer);
		saleItem.setQuantity(saleItemDto.getQuantity());
		medicineDao.reduceQuantity(medicine.getId(), saleItemDto.getQuantity());
		Double amount = (double) (saleItemDto.getQuantity()*medicine.getPrice());
		saleItem.setAmount(amount);
		saleItem.setDate(new Date());
		saleItemDao.addSaleItem(saleItem);
		
	}

}
