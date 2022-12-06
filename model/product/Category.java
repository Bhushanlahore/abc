package com.yash.pms.model.product;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "category")
public class Category {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long cid;
	private String name;
	private String description;
	private boolean isDeleted = false;
	
	
	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Product> pc = new LinkedHashSet<>();
	
	
	public Category() {
		
	}

	public Category(String name, String description, boolean isDeleted, Set<Product> pc) {
		super();
		this.name = name;
		this.description = description;
		this.isDeleted = isDeleted;
		this.pc = pc;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
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

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Set<Product> getPc() {
		return pc;
	}

	public void setPc(Set<Product> pc) {
		this.pc = pc;
	}

	

	}
