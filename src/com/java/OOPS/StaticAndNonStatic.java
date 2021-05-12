package com.java.OOPS;

public class StaticAndNonStatic {
	
	String name;
	static String collegaName;
	
	public void getName() {
		System.out.println(name);
	}
	
	public static void getCollegeName() {
		System.out.println(collegaName);
		//System.out.println(name);//Cannot make a static reference to the non-static field name
	}

	public static void main(String[] args) {
		
		StaticAndNonStatic st = new StaticAndNonStatic();
		st.name="Abhi";
		st.getName();
		
		//calling static variables and Method
		
		collegaName= "ABCD";
		getCollegeName();
		
		StaticAndNonStatic.collegaName = "ABC";
		System.out.println();
		
		
		

	}

}
