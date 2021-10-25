package com.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	@Autowired
	@Qualifier("engine1")
	private Engine engine;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + "]";
	}
	
}
