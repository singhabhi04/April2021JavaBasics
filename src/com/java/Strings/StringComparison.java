package com.java.Strings;

public class StringComparison {

	public static void main(String[] args) {
		String s1= "Abhishek";
		String s2= "Abhishek";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("Shanvi");
		String s4 = new String("Shanvi");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
