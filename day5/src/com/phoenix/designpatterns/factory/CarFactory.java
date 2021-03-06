/*
 * Author: dhruvi.shah1@stltech.in
 * Creation Date: 16-June-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
package com.phoenix.designpatterns.factory;

import com.phoenix.designpatterns.factory.cars.Car;
import com.phoenix.designpatterns.factory.cars.CoupleCar;
import com.phoenix.designpatterns.factory.cars.LuxuryCar;
import com.phoenix.designpatterns.factory.cars.SedanCar;
import com.phoenix.designpatterns.factory.cars.SportCar;

public class CarFactory {

	//factory method
	public static Car newCar(String carType)
	{
		if(carType.equals("Sedan"))
			return new SedanCar();
		else if(carType.equals("Couple"))
			return new CoupleCar();
		else if(carType.equals("Sport"))
			return new SportCar();
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		else
			return null;
	}
}
