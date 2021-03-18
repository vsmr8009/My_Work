package com.cognizant.truyum.model;

public class MenuItem {
	private long id;
	private String name;
	private float price;
	private boolean active;
	private String category;
	private boolean freeDelivery;
	
	public MenuItem(long id, String name, float price, boolean active, String category,
			boolean freeDelivery) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.active = active;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(boolean freeDelivery) {
		this.freeDelivery = freeDelivery;
	}
	
	public String toString() {
		return "MenuItem [id=" + this.id + ", price=" + this.price + ", name=" + this.name + ", category=" + this.category + ", freeDelivery=" + this.freeDelivery + ", active=" + this.active + "]";
	}
	
    public boolean equals(final MenuItem m1) {
        return this.getId() == m1.getId();
    }
	

}
