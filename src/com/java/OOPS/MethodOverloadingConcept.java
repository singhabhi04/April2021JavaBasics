package com.java.OOPS;

public class MethodOverloadingConcept {
	
	// Method Overloading: within the class, having different methods with same
	// name but different number of parameters
	// and different types of parameters
	
	//many+forms --> Compile Time PolyMorphism
	
	public void login(String userName,String password) {
		System.out.println("Login using userName and Password");
	}
	
	public void login(String mobileNumber,int otp) {
		System.out.println("Login using mobileNumber and otp");
	}
	
	

	public static void main(String[] args) {
		MethodOverloadingConcept mol = new MethodOverloadingConcept();
		mol.login("9038168803", 12345);
		mol.login("Abhishek", "test@123");
		
	

	}

}
