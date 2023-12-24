package com.cts.training.msms.service;

import java.util.List;

import javax.validation.Valid;

import com.cts.training.msms.entity.Admin;

public interface AdminService {
	
	List<Admin> getAdminDetails();
	
	Admin getAdminByUsernameAndPassword(Admin admin);

	Admin getAdminByUsernameAndPassword(String username, String password);

	Admin createAdmin(@Valid Admin admin);

	Admin updateAdmin(@Valid Long id, Admin admin);

	boolean deleteAdmin(Long id);

}
