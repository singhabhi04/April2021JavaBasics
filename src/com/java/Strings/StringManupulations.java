package com.java.Strings;

public class StringManupulations {

	public static void main(String[] args) {
	String str = "This is a java string example for manupulation";
	 System.out.println(str.length());
	 System.out.println(str.charAt(7));	
	 System.out.println(str.charAt(18));	
	// System.out.println(str.charAt(46));	java.lang.StringIndexOutOfBoundsException: 
	 System.out.println(str.indexOf('j'));
	 System.out.println(str.indexOf('a'));
	 System.out.println(str.indexOf('u'));
	 
	 System.out.println(str.indexOf("a", str.indexOf('a')+1));// second occurrence
	 System.out.println(str.indexOf("java"));
	 System.out.println(str.indexOf("Hello"));//(if String is not matched it will return -1)
	 
	 String demo = "Hello World";
	 System.out.println(demo.toUpperCase());
	 System.out.println(demo.toLowerCase());
	String [] strarray = demo.split(" ");
	System.out.println(strarray[0].toUpperCase()+" "+strarray[1].toLowerCase());
	}

}
