package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.AbstractCar;
import com.design.pattern.creational.factory.Tiago;

public class TiagoFactory extends CarAbstractFactory {

	private String color;
	private String vehicleNumber;
	private Integer topSpeed;
	private Integer tankCapacity;
	private String gearType;
	private String stearingType;
	
	/**
	 * @param color
	 * @param vehicleNumber
	 * @param topSpeed
	 * @param tankCapacity
	 * @param gearType
	 * @param stearingType
	 */
	public TiagoFactory(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType,
			String stearingType) {
		super();
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.topSpeed = topSpeed;
		this.tankCapacity = tankCapacity;
		this.gearType = gearType;
		this.stearingType = stearingType;
	}

	@Override
	public AbstractCar getAbstractCarDetail() {
		return new Tiago(color, vehicleNumber, topSpeed, tankCapacity, gearType, stearingType);
	}

}
