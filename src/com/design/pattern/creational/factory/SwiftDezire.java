package com.design.pattern.creational.factory;

public class SwiftDezire extends AbstractCar{

	private boolean isMusicSystemAvailable;
	
	public SwiftDezire(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType,boolean isMusicSystemAvailable) {
		super(color, vehicleNumber, topSpeed, tankCapacity, gearType);
		this.isMusicSystemAvailable = isMusicSystemAvailable;
	}

	public boolean isMusicSystemAvailable() {
		return isMusicSystemAvailable;
	}

	@Override
	public String toString() {
		return "SwiftDezire [isMusicSystemAvailable=" + isMusicSystemAvailable + ", toString()=" + super.toString()
				+ "]";
	}

}
