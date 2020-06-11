package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.Car;
import com.design.pattern.creational.factory.Toyta;

public class ToytaFactory implements CarInterfaceAbstractFactory {

	private String color;
	private String vehicleNumber;
	private Integer topSpeed;
	private Integer tankCapacity;
	private String gearType;
	
	/**
	 * @param color
	 * @param vehicleNumber
	 * @param topSpeed
	 * @param tankCapacity
	 * @param gearType
	 */
	public ToytaFactory(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType) {
		super();
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.topSpeed = topSpeed;
		this.tankCapacity = tankCapacity;
		this.gearType = gearType;
	}

	@Override
	public Car getCarDetail() {
		return new Toyta(color, vehicleNumber, topSpeed, tankCapacity, gearType);
	}

}
