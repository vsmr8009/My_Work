package com.cts.practise.msms.service;

import java.util.List;

import com.cts.practise.msms.model.Medicine;

public interface MedicineService {
	
	public void createMedicine(Medicine medicine);
	
	public List<Medicine> getMedicines();
	
	public Medicine getMedicineById(Long id);
	
	public void updateMedicine(Medicine medicine);
	
	public void deleteMedicineById(Long id);
}
