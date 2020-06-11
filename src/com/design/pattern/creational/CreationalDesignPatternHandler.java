package com.design.pattern.creational;

import com.design.pattern.DesignPatternImpBasedOn;
import com.design.pattern.creational.abstractfactory.CarAbstractFcatoryConsumer;
import com.design.pattern.creational.abstractfactory.SedanFactory;
import com.design.pattern.creational.abstractfactory.SwiftDezireFactory;
import com.design.pattern.creational.abstractfactory.TiagoFactory;
import com.design.pattern.creational.abstractfactory.ToytaFactory;
import com.design.pattern.creational.builder.Card;
import com.design.pattern.creational.builder.CardBuilder;
import com.design.pattern.creational.builder.Phone;
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

		System.out.println();
		System.out.println("Builder Design Pattern :- ");
		System.out.println();

		showBuilderDesignPattern(DesignPatternImpBasedOn.NONE_BASED);
		showBuilderDesignPattern(DesignPatternImpBasedOn.INNERCLASS_BASED);


	}

	private static void showFactoryDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
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

	private static void showAbstractFactoryDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
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

	private static void showBuilderDesignPattern(DesignPatternImpBasedOn designPatternImpBasedOn) {
		switch (designPatternImpBasedOn) {
		case NONE_BASED:
			Card card = new CardBuilder("credit card", "1234", "Santosh	Kumar", "HDFC").setLinkedMobileNumber(9992221211L).build();
			System.out.println("Builder Pattern Card Example1 : "+card.toString());
			card = new CardBuilder("Debit card", "12346547", "Anish	Kumar", "AXIS").setLinkedMobileNumber(3423321211L).setLinkedAccountNumber("67564666556").build();
			System.out.println("Builder Pattern Card Example2 : "+card.toString());
			break;
		case INNERCLASS_BASED:
			//Using builder to get the object in a single line of code and 
            //without any inconsistent state or arguments management issues		
			Phone phone = new Phone.PhoneBuilder("Android", 6, "Snapdragon-712", 5.6D, 5000).setBrand("Samsung").build();
			System.out.println("Builder Pattern Phone Example1 : "+phone.toString());
			phone = new Phone.PhoneBuilder("Android", 4, "Snapdragon-512", 5.2D, 4500).setBrand("Xiomi").setMadeIn("India").build();
			System.out.println("Builder Pattern Phone Example2 : "+phone.toString());
			break;
		default:
			break;
		}
	}

}
