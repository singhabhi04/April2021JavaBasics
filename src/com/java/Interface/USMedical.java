package com.java.Interface;

//All the variables in Interface are static and final by default



public interface USMedical {
	
	int min_Fee = 500;
	
	public void daibeticService();
	public void renalService();
	public void ambulanceService();
	
	//After JDK 1.8 
	//1. We can have static method with body in Interface
	public static void hospitalAdmin() {
		System.out.println("US Hospital Admin");
		
		
		
	}
	//2. We can have default methods
	default void billing() {
		System.out.println("US - Billing");
	}
// A class can extend only one class at a time
	// A class can implement any number of Interfaces simultaneously 
	//An Interface and extend any number of Interface simultaneously
	//A class can extend only one class at a time and implement any number of Interfaces at at time.
}
