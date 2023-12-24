package com.cts.training.msms.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.training.msms.entity.Admin;
import com.cts.training.msms.exception.ResourceNotFoundException;
import com.cts.training.msms.repository.AdminRepository;
import com.cts.training.msms.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public List<Admin> getAdminDetails() {
		return adminRepository.findAll();		
		
	}

	@Override
	public Admin getAdminByUsernameAndPassword(Admin admin) {
		return adminRepository.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		
	}

	@Override
	public Admin getAdminByUsernameAndPassword(String username, String password) {
		return adminRepository.findByUsernameAndPassword(username, password);
		
	}

	@Override
	public Admin createAdmin(@Valid Admin admin) {
		return adminRepository.save(admin);
		
	}

	@Override
	public Admin updateAdmin(@Valid Long id, Admin admin) {
		Admin admin2 = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Admin doesn't exist with id: "+id));
		admin2.setUsername(admin.getUsername());
		admin2.setPassword(admin.getPassword());
		Admin updatedAdmin = adminRepository.save(admin2);
		return updatedAdmin;
	}

	@Override
	public boolean deleteAdmin(Long id) {
		Admin admin = adminRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Admin doesn't exist with id: "+id));
		adminRepository.delete(admin);
		return true;
		
	}

}
