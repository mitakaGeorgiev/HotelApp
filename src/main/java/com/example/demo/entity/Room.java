package com.example.demo.entity;

import java.util.List;
import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Room {
	@Id
	@GeneratedValue
	private Integer id;
	private String type;
	private double price;
	private String foodinc;
	private String dates;
	private Integer nights;
	@ManyToOne(targetEntity=User.class,cascade =CascadeType.ALL)
	@JoinColumn(name="userID",referencedColumnName = "id")
	private User user;
	
	@ManyToOne(targetEntity=Catalog.class,cascade =CascadeType.ALL)
	@JoinColumn(name="catalogID",referencedColumnName = "id")
	private Catalog catalog;
	
	
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String getDates() {
		return dates;
	}

	public void setDates(String dates) {
		this.dates = dates;
	}

	public Integer getNights() {
		return nights;
	}

	public void setNights(Integer nights) {
		this.nights = nights;
	}

	public String getFoodinc() {
		return foodinc;
	}

	public void setFoodinc(String foodinc) {
		this.foodinc = foodinc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	
}
