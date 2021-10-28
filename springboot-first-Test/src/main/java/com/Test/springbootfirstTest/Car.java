package com.Test.springbootfirstTest;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {
	
	@Id
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	

}
