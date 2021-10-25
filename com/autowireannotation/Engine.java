package com.autowireannotation;

public class Engine {
	private String type;
	private  String stroke;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStroke() {
		return stroke;
	}
	public void setStroke(String stroke) {
		this.stroke = stroke;
	}
	public Engine(String type, String stroke) {
		super();
		this.type = type;
		this.stroke = stroke;
	}
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Engine [type=" + type + ", stroke=" + stroke + "]";
	}
	

}
