package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.AbstractCar;
import com.design.pattern.creational.factory.SwiftDezire;

public class SwiftDezireFactory extends CarAbstractFactory {

	private String color;
	private String vehicleNumber;
	private Integer topSpeed;
	private Integer tankCapacity;
	private String gearType;
	private boolean isMusicSystemAvailable;
	
	/**
	 * @param color
	 * @param vehicleNumber
	 * @param topSpeed
	 * @param tankCapacity
	 * @param gearType
	 * @param isMusicSystemAvailable
	 */
	public SwiftDezireFactory(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity,
			String gearType, boolean isMusicSystemAvailable) {
		super();
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.topSpeed = topSpeed;
		this.tankCapacity = tankCapacity;
		this.gearType = gearType;
		this.isMusicSystemAvailable = isMusicSystemAvailable;
	}

	@Override
	public AbstractCar getAbstractCarDetail() {
		return new SwiftDezire(color, vehicleNumber, topSpeed, tankCapacity, gearType, isMusicSystemAvailable);
	}

}
