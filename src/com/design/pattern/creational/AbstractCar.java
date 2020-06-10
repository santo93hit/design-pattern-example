package com.design.pattern.creational;

public abstract class AbstractCar {
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
	public AbstractCar(String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType) {
		super();
		this.color = color;
		this.vehicleNumber = vehicleNumber;
		this.topSpeed = topSpeed;
		this.tankCapacity = tankCapacity;
		this.gearType = gearType;
	}
	
	public String getColor() {
		return color;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public Integer getTopSpeed() {
		return topSpeed;
	}
	public Integer getTankCapacity() {
		return tankCapacity;
	}
	public String getGearType() {
		return gearType;
	}

	@Override
	public String toString() {
		return "AbstractCar [color=" + color + ", vehicleNumber=" + vehicleNumber + ", topSpeed=" + topSpeed
				+ ", tankCapacity=" + tankCapacity + ", gearType=" + gearType + "]";
	}
	
}
