package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Catalog {
	@Id
	@GeneratedValue
private Integer id;
public String type;
public Integer maxbeds;
public String view;
public double pricePerNight;
public String foodinc;
//public List<Catalog>catalogs;
public Catalog() {
	super();
	// TODO Auto-generated constructor stub
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getView() {
	return view;
}
public void setView(String view) {
	this.view = view;
}
public String getFoodinc() {
	return foodinc;
}
public void setFoodinc(String foodinc) {
	this.foodinc = foodinc;
}

public double getPricePerNight() {
	return pricePerNight;
}
public void setPricePerNight(double pricePerNight) {
	this.pricePerNight = pricePerNight;
}
public Integer getMaxbeds() {
	return maxbeds;
}
public void setMaxbeds(Integer maxbeds) {
	this.maxbeds = maxbeds;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

}
