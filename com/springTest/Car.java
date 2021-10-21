package com.springTest;

public class Car {
	private int carId;
	private String carName;
	private String carColor;
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		System.out.println("Setting Car Id");
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		System.out.println("Setting car Name");
		this.carName = carName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public Car(int carId, String carName, String carColor) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.carColor = carColor;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", carColor=" + carColor + "]";
	}
	
	

}
