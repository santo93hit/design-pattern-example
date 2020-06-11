package com.design.pattern.creational.abstractfactory;

import com.design.pattern.creational.factory.AbstractCar;
import com.design.pattern.creational.factory.Car;

public class CarAbstractFcatoryConsumer {
	
	public static Car getAbstractFactoryCarDetail(CarInterfaceAbstractFactory carInterfaceAbstractFactory) {
		return carInterfaceAbstractFactory.getCarDetail();
	}
	
	public static AbstractCar getAbstractFactoryAbstractCarDetail(CarAbstractFactory carAbstractFactory) {
		return carAbstractFactory.getAbstractCarDetail();
	}
}
