package com.yash.pms.model.product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	
	@Column(length = 1000)
	private String name;
	
	@Column(length = 5000)
	private String description;
	private String image;
	private boolean isDeleted = false;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Category category;
	

	@ManyToOne(fetch = FetchType.EAGER)
	private Company company;
	
	public Product() {
		
	}
	

	
	
	public Long getPid() {
		return pid;
	}




	public void setPid(Long pid) {
		this.pid = pid;
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




	public String getImage() {
		return image;
	}




	public void setImage(String image) {
		this.image = image;
	}




	public boolean isDeleted() {
		return isDeleted;
	}




	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}



	public Category getCategory() {
		return category;
	}




	public void setCategory(Category category) {
		this.category = category;
	}




	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}


	
	
	
	
	
}
