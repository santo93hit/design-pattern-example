package com.design.pattern.creational;

import com.design.pattern.DesignPatternImpBasedOn;
import com.design.pattern.creational.abstractfactory.CarAbstractFcatoryConsumer;
import com.design.pattern.creational.abstractfactory.SedanFactory;
import com.design.pattern.creational.abstractfactory.SwiftDezireFactory;
import com.design.pattern.creational.abstractfactory.TiagoFactory;
import com.design.pattern.creational.abstractfactory.ToytaFactory;
import com.design.pattern.creational.factory.AbstractCar;
import com.design.pattern.creational.factory.Car;
import com.design.pattern.creational.factory.CarFactory;
import com.design.pattern.creational.factory.CarType;

public class CreationalDesignPatternHandler {

	public static void main(String[] args) {
		
		System.out.println("Factory Pattern :- ");
		System.out.println();
		showFactoryDesignPattern(DesignPatternImpBasedOn.INTERFACE_BASED);
		showFactoryDesignPattern(DesignPatternImpBasedOn.ABSTRACT_CLASS_BASED);
		
		System.out.println();
		System.out.println("Abstract Factory Pattern :- ");
		System.out.println();
		
		showAbstractFactoryDesignPattern(DesignPatternImpBasedOn.INTERFACE_BASED);
		showAbstractFactoryDesignPattern(DesignPatternImpBasedOn.ABSTRACT_CLASS_BASED);
		
		
	}
	
	public static void showFactoryDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
		switch (designPatternImpBasedOn) {
		case INTERFACE_BASED:
			Car sedanCar = CarFactory.getCarDetail(CarType.SEDAN, "RED", "KATLP7986", 140, 30, "MANUAL");
			System.out.println("Factory Sedan Car Details : "+sedanCar.toString());
			Car toytaCar = CarFactory.getCarDetail(CarType.TOYTA, "RED", "BRCTP9096", 220, 40, "AUTOMATIC");
			System.out.println("Factory Toyta Car Details : "+toytaCar.toString());
			break;
		case ABSTRACT_CLASS_BASED:
			AbstractCar tiagoCar = CarFactory.getAbstractCarDetail(CarType.TIAGO, "RED", "KATLP7986", 140, 30, "MANUAL","Hydrollic",false);
			System.out.println("Factory Tiago Car Details : "+tiagoCar.toString());
			AbstractCar swiftDezireCar = CarFactory.getAbstractCarDetail(CarType.SWITDEZIRE, "RED", "BRCTP9096", 220, 40, "AUTOMATIC",null,true);
			System.out.println("Factory SwiftDezire Car Details : "+swiftDezireCar.toString());
			break;
		default:
			break;
		}
	}
	
	public static void showAbstractFactoryDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
		switch (designPatternImpBasedOn) {
		case INTERFACE_BASED:
			Car sedanCar = CarAbstractFcatoryConsumer.getAbstractFactoryCarDetail(new SedanFactory("RED", "KATLP7986", 140, 30, "MANUAL"));
			System.out.println("Abstract Factory Sedan Car Details : "+sedanCar.toString());
			Car toytaCar = CarAbstractFcatoryConsumer.getAbstractFactoryCarDetail(new ToytaFactory("RED", "BRCTP9096", 220, 40, "AUTOMATIC"));
			System.out.println("Abstract Factory Toyta Car Details : "+toytaCar.toString());
			break;
		case ABSTRACT_CLASS_BASED:
			AbstractCar tiagoCar = CarAbstractFcatoryConsumer.getAbstractFactoryAbstractCarDetail(new TiagoFactory("RED", "KATLP7986", 140, 30, "MANUAL","Hydrollic"));
			System.out.println("Abstract Factory Tiago Car Details : "+tiagoCar.toString());
			AbstractCar swiftDezireCar = CarAbstractFcatoryConsumer.getAbstractFactoryAbstractCarDetail(new SwiftDezireFactory("RED", "BRCTP9096", 220, 40, "AUTOMATIC",true));
			System.out.println("Abstract Factory SwiftDezire Car Details : "+swiftDezireCar.toString());
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
