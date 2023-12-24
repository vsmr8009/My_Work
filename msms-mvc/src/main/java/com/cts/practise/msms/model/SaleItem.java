package com.cts.practise.msms.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sale_item")
public class SaleItem {
	@Id
	@Column(name = "sale_item_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(targetEntity = Customer.class)
	@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
	private Customer customer;
	@ManyToOne(targetEntity = Medicine.class)
	@JoinColumn(name = "medicine_id", referencedColumnName = "medicine_id")
	private Medicine medicine;
	@Column(name = "sale_item_quantity")
	private Integer quantity;
	@Column(name = "sale_amount")
	private Double amount;
	@Column(name = "sale_date")
	private Date date;

	public SaleItem() {
		super();
	}

	public SaleItem(Long id, Customer customer, Medicine medicine, Integer quantity, Double amount, Date date) {
		super();
		this.id = id;
		this.customer = customer;
		this.medicine = medicine;
		this.quantity = quantity;
		this.amount = amount;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "SaleItem [id=" + id + ", customer=" + customer + ", medicine=" + medicine + ", quantity=" + quantity
				+ ", amount=" + amount + ", date=" + date + "]";
	}

}
