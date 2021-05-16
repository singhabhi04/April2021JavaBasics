package com.java.Strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("Abhishek");
		StringBuffer sb2 = new StringBuffer("Abhishek");
		
		System.out.println(sb1);
		System.out.println(sb1.reverse());
		
		System.out.println(sb1.equals(sb2));
// In String Buffer Class equals method is not overidden for content comparison
	}

}
