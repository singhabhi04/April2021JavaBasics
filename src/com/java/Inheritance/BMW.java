package com.java.Inheritance;

public class BMW extends Car {

	@Override
	public void start() {
		System.out.println("BMW Start method");
	}

	public void autoParking() {
		System.out.println("BMW auto parking");
	}
	//@Override  --We cannot override static method
	public static void wheelCount() {
		System.out.println("Static method BMW");
	}
	
	//We cannot override final method
	//if a class is declared as final, we cannot extend that class(Inheritance is not possible)
	
}
