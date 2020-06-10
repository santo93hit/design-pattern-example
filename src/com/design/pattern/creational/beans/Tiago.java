package com.design.pattern.creational.beans;

import com.design.pattern.creational.AbstractCar;

public class Tiago extends AbstractCar{

	private String stearingType;
	
	public Tiago(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType,String stearingType) {
		super(color, vehicleNumber, topSpeed, tankCapacity, gearType);
		this.stearingType = stearingType;
	}

	public String getStearingType() {
		return stearingType;
	}

	@Override
	public String toString() {
		return "Tiyago [stearingType=" + stearingType + ", toString()=" + super.toString() + "]";
	}
	
}
