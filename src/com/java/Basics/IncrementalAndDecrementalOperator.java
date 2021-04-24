package com.java.Basics;

public class IncrementalAndDecrementalOperator {

	public static void main(String[] args) {
		//post increment
		int a =1;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		int c =-99;
		int d = c++;
		System.out.println(c);
		System.out.println(d);
		
		//pre -increment
		int m=1;
		int n = ++m;
		System.out.println(m);
		System.out.println(n);
		
		//post-decrement 
		int x=2;
		int y= x--;
		 	System.out.println(x);
		 	System.out.println(y);
		 	
		 	int total =100;
		 	System.out.println(total++);
		 	System.out.println(total);
		 	
		 	char c1 ='a';
		 	System.out.println(++c1);//b
		
	}

}
