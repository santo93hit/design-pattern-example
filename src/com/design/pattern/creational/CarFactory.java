package com.design.pattern.creational;

import com.design.pattern.creational.beans.CarType;
import com.design.pattern.creational.beans.Sedan;
import com.design.pattern.creational.beans.SwiftDezire;
import com.design.pattern.creational.beans.Tiago;
import com.design.pattern.creational.beans.Toyta;

public class CarFactory {
	
	public static Car getCarDetail(CarType type,String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType) {
		Car car = null;
		switch(type) {
			case SEDAN:
				car = new Sedan(color, vehicleNumber, topSpeed, tankCapacity, gearType);
				break;
			case TOYTA:
				car = new Toyta(color, vehicleNumber, topSpeed, tankCapacity, gearType);
				break;
			default:
				break;
		}
		return car;
	}
	
	public static AbstractCar getAbstractCarDetail(CarType type,String color, String vehicleNumber, Integer topSpeed, Integer tankCapacity, String gearType,String stearingType,boolean isMusicSystemAvailable) {
		AbstractCar abstractCar = null;
		switch(type) {
			case TIAGO:
				abstractCar = new Tiago(color, vehicleNumber, topSpeed, tankCapacity, gearType,stearingType);
				break;
			case SWITDEZIRE:
				abstractCar = new SwiftDezire(color, vehicleNumber, topSpeed, tankCapacity, gearType,isMusicSystemAvailable);
				break;
			default:
				break;
		}
		return abstractCar;
	}
}
