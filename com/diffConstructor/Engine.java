package com.diffConstructor;

public class Engine {
	
	int e_id;
	String e_type;
	public Engine(int e_id, String e_type) {
		this.e_id = e_id;
		this.e_type = e_type;
	}
	@Override
	public String toString() {
		return "Engine [e_id=" + e_id + ", e_type=" + e_type + "]";
	}
	
	
	
	

}
