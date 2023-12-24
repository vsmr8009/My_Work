package com.cts.practise.msms.dao;

import java.util.List;

import com.cts.practise.msms.model.Medicine;

public interface MedicineDao {
	
	public void saveMedicine(Medicine medicine);
	
	public List<Medicine> loadMedicines();
	
	public Medicine loadMedicine(Long id);
	
	public void updateMedicine(Medicine medicine);
	
	public void deleteMedicine(Medicine medicine);
	
	public void reduceQuantity(Long id, Integer quantity);

}
