package com.java.OOPS;

public class Employee {
	String name;
	int age;
	double salary;
	boolean isMarried;
	

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name= "Abhishek";
		e1.age=30;
		e1.salary=250000;
		e1.isMarried= true;
		
		System.out.println("Employee Name is :"+e1.name +" Age is :"+e1.age+" Salary is :"+e1.salary+" is married:"+e1.isMarried);
		Employee e2 = new Employee();
		e2.name= "Sweta";
		e2.age=24;
		e2.salary=25000;
		e2.isMarried= true;
		
		System.out.println("Employee Name is :"+e2.name +" Age is :"+e2.age+" Salary is :"+e2.salary+" is married:"+e2.isMarried);
		
		Employee e3 = new Employee();
		e3.name= "Shanvi";
		e3.age=01;
		e3.salary=0;
		e3.isMarried= false;
		System.out.println(e3.name);
		e3=null;
	//	System.out.println(e3.name);java.lang.NullPointerException
		
		e1=e2;
	//	e1 will now point to e2 object
		System.out.println(e1.name);
		System.out.println(e2.name);
	}

}
