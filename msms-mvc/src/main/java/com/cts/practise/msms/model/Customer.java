package com.cts.practise.msms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customer_id")
	private Long id;
	@Column(name = "customer_name", nullable = false)
	@NotNull(message = "Please provide customer name")
	@Size(min = 1)
	private String name;
	@Column(name = "customer_village", nullable = false)
	@NotNull(message = "Please provide customer village name")
	private String village;
	@Column(name = "pincode", nullable = false)
	@Pattern(regexp = "^[1-9]{1}[0-9]{5}", message = "Pincode should have 6 digits and should not start with 0")
	@NotBlank(message = "Please provide customer pincode")
	private String pincode;
	@Column(name = "phone", nullable = false)
	@Pattern(regexp="^[789]{1}[0-9]{9}", message="Mobile number should have 10 digits and starting with 7/8/9")
	@NotNull
	private String phone;

	public Customer() {
		super();
	}

	public Customer(Long id, String name, String village, String pincode, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.village = village;
		this.pincode = pincode;
		this.phone = phone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", village=" + village + ", pincode=" + pincode + ", phone="
				+ phone + "]";
	}

}
