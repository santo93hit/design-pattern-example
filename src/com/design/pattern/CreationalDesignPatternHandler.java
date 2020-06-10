package com.design.pattern;

import com.design.pattern.creational.AbstractCar;
import com.design.pattern.creational.Car;
import com.design.pattern.creational.CarFactory;
import com.design.pattern.creational.beans.CarType;

public class CreationalDesignPatternHandler {

	public static void main(String[] args) {
		
		showFactoryDesignPattern(DesignPatternImpBasedOn.INTERFACE_BASED);
		showFactoryDesignPattern(DesignPatternImpBasedOn.ABSTRACT_CLASS_BASED);
	}
	
	public static void showFactoryDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
		switch (designPatternImpBasedOn) {
		case INTERFACE_BASED:
			Car sedanCar = CarFactory.getCarDetail(CarType.SEDAN, "RED", "KATLP7986", 140, 30, "MANUAL");
			System.out.println("Sedan Car Details : "+sedanCar.toString());
			Car toytaCar = CarFactory.getCarDetail(CarType.TOYTA, "RED", "BRCTP9096", 220, 40, "AUTOMATIC");
			System.out.println("Toyta Car Details : "+toytaCar.toString());
			break;
		case ABSTRACT_CLASS_BASED:
			AbstractCar tiagoCar = CarFactory.getAbstractCarDetail(CarType.TIAGO, "RED", "KATLP7986", 140, 30, "MANUAL","Hydrollic",false);
			System.out.println("Tiago Car Details : "+tiagoCar.toString());
			AbstractCar swiftDezireCar = CarFactory.getAbstractCarDetail(CarType.SWITDEZIRE, "RED", "BRCTP9096", 220, 40, "AUTOMATIC",null,true);
			System.out.println("SwiftDezire Car Details : "+swiftDezireCar.toString());
			break;
		default:
			break;
		}
	}
	
//	public static void showFactoryDesignPatternBasedOnA(DesignPatternImpBasedOn designPatternImpBasedOn) {
//		Car sedanCar = CarFactory.getCarDetail(CarType.SEDAN, "RED", "KATLP7986", 140, 30, "MANUAL");
//		System.out.println("Sedan Car Details : "+sedanCar.toString());
//		Car toytaCar = CarFactory.getCarDetail(CarType.TOYTA, "RED", "BRCTP9096", 220, 40, "AUTOMATIC");
//		System.out.println("Toyta Car Details : "+toytaCar.toString());
//	}

}
