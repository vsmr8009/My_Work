package com.cts.practise.msms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@NamedNativeQueries({
		@NamedNativeQuery(name = "reduceMedicineByQuantity", query = "UPDATE medicine m set m.medicine_quantity = (m.medicine_quantity-:quantity) where m.medicine_quantity>=:quantity and m.medicine_id = :id", resultClass = Medicine.class)

})

@Entity
@Table(name = "medicine")
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "medicine_id")
	private Long id;
	@Column(name = "medicine_name", nullable = false)
	private String name;
	@Column(name = "company_name", nullable = false)
	private String company;
	@Column(name = "medicine_category", nullable = false)
	private String category;
	@Column(name = "medicine_quantity", nullable = false)
	private Integer quantity;
	@Column(name = "medicine_price", nullable = false)
	private Integer price;

	public Medicine() {
		super();
	}

	public Medicine(Long id, String name, String company, String category, Integer quantity, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
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

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Medicine [id=" + id + ", name=" + name + ", company=" + company + ", quantity=" + quantity
				+ ", category=" + category + ", price=" + price + "]";
	}

}
