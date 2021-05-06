package com.java.OOPS;

public class Users {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		Users u1 = new Users();
		u1.name="Abhishek";
		u1.age=28;
		u1.city="Rabodh";
		System.out.println(u1.name+" "+u1.age+" "+u1.city);
		Users u2 = new Users();
		u2.name="Sweta";
		u2.age=24;
		u2.city="Chatra";
		System.out.println(u2.name+" "+u2.age+" "+u2.city);
		Users u3 = new Users();
		u3.name="Sumit";
		u3.age=28;
		u3.city="Koderma";
		System.out.println(u3.name+" "+u3.age+" "+u3.city);
		
		
		 u1=u2; //u1 will now refer to u2
			System.out.println(u1.name+" "+u1.age+" "+u1.city);
			System.out.println(u2.name+" "+u2.age+" "+u2.city);
			System.out.println(u3.name+" "+u3.age+" "+u3.city);
			
			u2=u3;
			
			System.out.println(u1.name+" "+u1.age+" "+u1.city);
			System.out.println(u2.name+" "+u2.age+" "+u2.city);
			System.out.println(u3.name+" "+u3.age+" "+u3.city);
			
			u3=u1;
			
			System.out.println(u1.name+" "+u1.age+" "+u1.city);
			System.out.println(u2.name+" "+u2.age+" "+u2.city);
			System.out.println(u3.name+" "+u3.age+" "+u3.city);
	}

}
