/**
 * 
 */
package com.design.pattern.creational.beans;

import com.design.pattern.creational.Car;

/**
 * @author kusantosh
 *
 */
public class Sedan implements Car{

	private String color;
	private String vehicleNumber;
	private Integer topSpeed;
	private Integer tankCapacity;
	private String gearType;
	
	public Sedan(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType) {
		super();
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.topSpeed = topSpeed;
		this.tankCapacity = tankCapacity;
		this.gearType = gearType;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}

	@Override
	public Integer getTopSpeed() {
		return this.topSpeed;
	}

	@Override
	public Integer getTankCapacity() {
		return this.tankCapacity;
	}

	@Override
	public String getGearType() {
		return this.gearType;
	}

	@Override
	public String toString() {
		return "Sedan [color=" + color + ", vehicleNumber=" + vehicleNumber + ", topSpeed=" + topSpeed
				+ ", tankCapacity=" + tankCapacity + ", gearType=" + gearType + "]";
	}
	
}
