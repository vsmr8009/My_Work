package com.cts.practise.msms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.practise.msms.model.Medicine;
import com.cts.practise.msms.service.MedicineService;

@Controller
public class MedicineController {

	@Autowired
	private MedicineService medicineService;

	@RequestMapping(value = "/new-medicine", method = RequestMethod.GET)
	public String addMedicineForm() {
		return "add-medicine-form";
	}
	
	@RequestMapping(value = "/add-medicine", method = RequestMethod.POST)
	public String addMedicine(@ModelAttribute("medicine") Medicine medicine) {
		medicineService.createMedicine(medicine);
		return "redirect:/medicines";
	}
	
	@RequestMapping(value = "/medicines", method = RequestMethod.GET)
	public String getMedicines(Model model) {
		List<Medicine> medicines = medicineService.getMedicines();
		model.addAttribute("medicines",medicines); 
		return "medicine-list";
	}
	
	@RequestMapping(value = "/edit-medicine/{id}", method = RequestMethod.GET )
	public String updateMedicineForm(@PathVariable Long id, Model model) {
		Medicine medicine = medicineService.getMedicineById(id);
		model.addAttribute(medicine);
		return "update-medicine-form";
	}
	
	@RequestMapping(value = "/update-medicine", method = RequestMethod.POST)
	public String updateMedicine(@ModelAttribute("medicine") Medicine medicine) {
		medicineService.updateMedicine(medicine);
		return "redirect:/medicines";
	}
	
	@RequestMapping("/delete-medicine/{id}")
	public String deleteMedicineById(@PathVariable Long id) {
		medicineService.deleteMedicineById(id);;
		return "redirect:/medicines";
	}
}
