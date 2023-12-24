package com.cts.practise.msms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.practise.msms.dao.MedicineDao;
import com.cts.practise.msms.exception.ResourceNotFoundException;
import com.cts.practise.msms.model.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService {

	@Autowired
	private MedicineDao medicineDao;

	@Override
	public void createMedicine(Medicine medicine) {
		medicineDao.saveMedicine(medicine);
		
	}

	@Override
	public List<Medicine> getMedicines() {
		return medicineDao.loadMedicines();
	}

	@Override
	public Medicine getMedicineById(Long id) {
		Medicine medicine = medicineDao.loadMedicine(id);
		if(medicine.equals(null)) {
			throw new ResourceNotFoundException("Medicine doesn't exist with id: "+id);
		}
		return medicine;
	}

	@Override
	public void updateMedicine(Medicine medicine) {
		medicineDao.updateMedicine(medicine);
		
	}

	@Override
	public void deleteMedicineById(Long id) {
		Medicine medicine = medicineDao.loadMedicine(id);
		if(medicine.equals(null)) {
			throw new ResourceNotFoundException("Medicine doesn't exist with id: "+id);
		}
		medicineDao.deleteMedicine(medicine);
	}

}
