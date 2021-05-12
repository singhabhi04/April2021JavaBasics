package com.java.Inheritance;

public class TestCar {

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.start();//overriden method
		bmw.stop();
		bmw.refuel();
		bmw.autoParking();//child class method
		
		Car car = new Car();
		car.start();
		car.start();
		car.refuel();
		
		
		//Top Casting
		Car c1 = new BMW();
		// child class object can be refereed by Parent class reference variable
		c1.start();
		c1.stop();
		c1.refuel();
		//c1.autoParking();//The method autoParking() is undefined for the type Car
		//We cannot call child class specific method with Parent class reference variable
		
//	BMW bmw1 = 	new Car();  //Type mismatch: cannot convert from Car to BMW
		//Parent class object cannot be refered by child class reference variable
		//Down casting
		BMW bmw1 = 	(BMW) new Car(); 
		
	//	Exception in thread "main" java.lang.ClassCastException: com.java.Inheritance.Car cannot be cast to com.java.Inheritance.BMW
		//at com.java.Inheritance.TestCar.main(TestCar.java:30)
//		bmw1.autoParking();
//		bmw1.start();
//		bmw1.stop();bmw1.refuel();
		
	}

}
