package com.cts.training.msms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "Admin")
@Entity
public class Admin {
	
	@Id
	@Column(name = "Admin_id")
	private Long id;
	
	@Column(name = "Username")
	private String username;
	
	@Column(name = "Password")
	private String password;

	public Admin() {
		super();
	}

	public Admin(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
