package com.cts.practise.msms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.practise.msms.model.Medicine;

@Repository
public class MedicineDaoImpl implements MedicineDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public void saveMedicine(Medicine medicine) {
		hibernateTemplate.save(medicine);
		
	}

	@Override
	public List<Medicine> loadMedicines() {
		return hibernateTemplate.loadAll(Medicine.class);
	}

	@Override
	public Medicine loadMedicine(Long id) {
		return hibernateTemplate.get(Medicine.class, id);
	}

	@Override
	@Transactional
	public void updateMedicine(Medicine medicine) {
		hibernateTemplate.update(medicine);
		
	}

	@Override
	@Transactional
	public void deleteMedicine(Medicine medicine) {
		hibernateTemplate.delete(medicine);
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void reduceQuantity(Long id, Integer quantity) {
		hibernateTemplate.findByNamedQuery("reduceMedicineByQuantity", quantity, id);
	}

}
