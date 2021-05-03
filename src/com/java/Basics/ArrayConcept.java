package com.java.Basics;

public class ArrayConcept {

	public static void main(String[] args) {
	int[] i = new int[5];
	i[0]= 5;
	i[1]= 51;
	i[2]= 15;
	i[3]= 54;
	i[4]= 65;
	System.out.println(i.length);
	System.out.println(i[0]);
	System.out.println(i[3]);
//	System.out.println(i[5]);//java.lang.ArrayIndexOutOfBoundsException
//	System.out.println(i[-1]);//java.lang.ArrayIndexOutOfBoundsException
	
	for(int j=0;j<i.length;j++) {
		System.out.print(i[j]+" ");
		
		
	}
	System.out.println();
	System.out.println("********");
	for(int e :i) {
		System.out.println(e);
	}
	}

}
