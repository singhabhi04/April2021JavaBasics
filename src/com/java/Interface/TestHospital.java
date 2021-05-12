package com.java.Interface;

public class TestHospital {

	public static void main(String[] args) {
		FortisHospital hosp = new FortisHospital();
		hosp.ambulanceService();
		hosp.MedicalInsuranceService();
		hosp.neuroService();
		hosp.dentalService();
		System.out.println("Minimum Fee is :"+USMedical.min_Fee );
		hosp.pathoLogyService();
		
		USMedical us = new FortisHospital();
		 //Child class Object can be Referred by Parent Interface Refrence variable
		//but we can access Method of that Interface Only
		//We cannot access FortisHospital owm mwthods as well
		
		us.ambulanceService();
		us.daibeticService();
		us.renalService();
		System.out.println("Minimum Fee is :"+USMedical.min_Fee );
		

	}

}
