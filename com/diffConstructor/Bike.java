package com.diffConstructor;

import java.util.List;

public class Bike {

	private int id;
	private String name;
	private List<String> color;
	private Engine en;
	
	public Bike(int id, String name, List<String> color, Engine en) {
		
		this.id = id;
		this.name = name;
		this.color = color;
		this.en = en;
	}

	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", color=" + color + ", en=" + en + "]";
	}
	
	

}
