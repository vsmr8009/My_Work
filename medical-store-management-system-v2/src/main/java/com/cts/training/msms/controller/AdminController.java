package com.cts.training.msms.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.msms.dto.AdminDTO;
import com.cts.training.msms.entity.Admin;
import com.cts.training.msms.service.AdminService;

@RestController
@RequestMapping("/msms/v2")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@GetMapping("/admin")
	public List<Admin> getAllAdminDetails() {
		return adminService.getAdminDetails(); 
	}
	
	@GetMapping("/admin/validate")
	public Admin validateAdminDetails(@RequestBody AdminDTO adminDTO) {
		Admin admin2 = adminService.getAdminByUsernameAndPassword(adminDTO.getUsername(), adminDTO.getPassword());
		return admin2;
	}
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> saveAdmin(@Valid @RequestBody Admin admin) {
			Admin admin2 = adminService.createAdmin(admin);
			return ResponseEntity.ok(admin2);
	}
	
	@PutMapping("/Admin/{id}")
	public ResponseEntity<Admin> updateAdminById(@Valid @PathVariable Long id, @RequestBody Admin admin){
		Admin updateAdmin = adminService.updateAdmin(id, admin);	
		return ResponseEntity.ok(updateAdmin);
	}
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteAdminById(@PathVariable Long id){
		adminService.deleteAdmin(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("Admin Deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
