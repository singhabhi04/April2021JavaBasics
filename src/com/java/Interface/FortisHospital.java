package com.java.Interface;

public class FortisHospital implements USMedical,UKMedical,IndianMedical{
//US medical methods
	@Override
	public void daibeticService() {
		System.out.println(" FH---> Daibetic Service");
		
	}

	@Override
	public void renalService() {
		System.out.println(" FH---> Renal Service");
		
	}

	@Override
	public void ambulanceService() {
		System.out.println(" FH---> Ambulance Service");
		
	}
	//Cannot reduce the visibility of the inherited method from USMedical
//	default void billing() {
//		System.out.println("US - Billing");
//	}
// UK methods
	@Override
	public void orthoService() {
		System.out.println(" FH---> Ortho Service");
		
	}
	

	@Override
	public void cardioService() {
		System.out.println(" FH---> Cardio Service");
		
	}

	@Override
	public void dentalService() {
		System.out.println(" FH---> Dental Service");
		
	}
// InidaMedical Methods
	@Override
	public void gyncServices() {
		System.out.println(" FH---> Gynecology Service");// TODO Auto-generated method stub
		
	}

	@Override
	public void neuroService() {
		System.out.println(" FH---> Neuro Service");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println(" FH---> Oncology Service");
		
	}
	
	// FH own methods
public void pathoLogyService() {
	System.out.println(" FH Own PatholOgy service");
}

public void MedicalInsuranceService() {
	System.out.println(" FH Own Medical Insurance service");
}
	

}
