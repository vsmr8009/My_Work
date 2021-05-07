package com.cts.training.UserDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sun.istack.Nullable;

@Entity
//@Table(name="user_details")
public class User {
	
	@Id
	private Long id;
	@NotEmpty(message="Username cannot be empty")
	@Size(min = 8, max= 50, message= "Username must be at least 8 Characters")
	@Column(unique = true, nullable = false)
	private String username;
	@NotBlank(message="Password cannot be empty")
	private String password;
	private String address;
	@NotNull(message="Phone number cannot be empty")
	private Long phone;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getPhone() {
		return phone;
	}
	public void setPhone(Long phone) {
		this.phone = phone;
	}
	

}
