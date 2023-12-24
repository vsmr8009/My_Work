package com.cts.training.msms.entity;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sales")
public class Sales implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "sales_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(targetEntity = Customer.class)
	@JoinColumn(name = "customer_id",referencedColumnName = "customer_id")
	private Customer customer;
	
	@JoinColumn
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true )
	private List<SaleItem> saleItems;
	
	@Column(name = "total_quantity")
	private Integer quantity;
	
	@Column(name = "total_amount")
	private Double amount;

	private LocalDateTime date;
	
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
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	public List<SaleItem> getSaleItem() {
		return saleItems;
	}
	public void setSaleItem(List<SaleItem> list) {
		this.saleItems = list;
	}

}