package com.cts.training.sb.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill {
	@Id
	private Long id;
	private String name;
	@Size(min=10, max=30, message="Description should be atleast size of 10")
	private String description;
	@NotEmpty(message="Level should not be empty")
	private String level;
	@NotNull(message="User id should be null")
	private Long user_id;
	
	
	public Skill() {
		super();
	}
	
	public Skill(Long id, String name, String description, String level, Long user_id) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.level = level;
		this.user_id = user_id;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	

}
