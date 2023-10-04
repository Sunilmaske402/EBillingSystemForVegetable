package com.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vegetable {
	
	@Id
	private int vegId;
	@Column
	private String vegName;
	@Column
	private int vegPrice;
	@Column
	private String vegImageName;
	public int getVegId() {
		return vegId;
	}
	public void setVegId(int vegId) {
		this.vegId = vegId;
	}
	public String getVegName() {
		return vegName;
	}
	public void setVegName(String vegName) {
		this.vegName = vegName;
	}
	public int getVegPrice() {
		return vegPrice;
	}
	public void setVegPrice(int vegPrice) {
		this.vegPrice = vegPrice;
	}
	public String getVegImageName() {
		return vegImageName;
	}
	public void setVegImageName(String vegImageName) {
		this.vegImageName = vegImageName;
	}
	
	
	
	
	

}
