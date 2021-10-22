package com.constructor.injection;

public class Laptop {

	private int id;
	private String name;
	private String color;
	private float price;
	public Laptop(int id, String name, String color, float price) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.color+" : "+this.price;
	}
	
	

}
