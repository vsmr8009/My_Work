package com.cts.training.msms;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cts.training.msms.entity.Medicine;
import com.cts.training.msms.repository.MedicineRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class MedicineTests {
	
	@Autowired
	private MedicineRepository medicineRepository;
	
	@Test
	public void createMedicineTest() {
		Medicine medicine = new Medicine("Coldact", "Cipla", 20, 30, "cough", "22/10/2021");
		medicineRepository.save(medicine);		
	}

}
