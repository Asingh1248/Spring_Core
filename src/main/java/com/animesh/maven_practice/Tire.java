package com.animesh.maven_practice;

import org.springframework.stereotype.Component;

@Component
public class Tire {
	private String brand;

//	public Tire(String brand) {
//		super();
//		this.brand = brand;
//	}

	@Override
	public String toString() {
		//return "Tire [brand=" + brand + "]";
		return "Its working...";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
   
}
