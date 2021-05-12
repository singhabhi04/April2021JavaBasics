package com.java.OOPS;

public class MOLAutomaticTypePromotion {
	
//	While resolving overloaded methods if the exact match method is not available,
//	you will not immediately get any compile-time error.
//
//	First, the compiler promotes the lower data type argument to the higher data type argument and
//	then checks whether the match method is available or not.
//	If the match method is available, it will be considered.This concept is called Automatic type promotion in Java
	
	public void m1(int i,int j) {
		System.out.println("automatic type promotion in Java int param");
	}
	
	public void m1(double i,double j) {
		System.out.println("automatic type promotion in Java double param");
	}

	public static void main(String[] args) {
		MOLAutomaticTypePromotion mol = new MOLAutomaticTypePromotion();
		mol.m1(10, 10);
		mol.m1(2.5, 2.5);
		mol.m1(2.5f, 2.5f);
		mol.m1(2, 2.5);
		mol.m1(2.5f, 2);

	}

}
