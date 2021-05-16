package com.java.Strings;

public class StringPart2 {

	public static void main(String[] args) {
		String str = "   67hghhkjjk  ";

		// trim
		System.out.println(str.trim());

		// replace
		String dob = "04-09-1990";
		System.out.println(dob.replace('-', '/'));
		String str1 = "This is java and java";
		System.out.println(str1.replace("java", "python"));

		// conatins
		if (str1.contains("java")) {
			System.out.println("java is present");
		} else {
			System.out.println("java is not there");
		}
		
		//equals - for content comparision
		
		String s1 = "string comparision example";
		String s2 = "string comparision example";
		System.out.println(s1.equals(s2));
		
		//substring
		String s3 = "your confirmation number is 87777";
		
		System.out.println(s3.substring(5));
		System.out.println(s3.substring(s3.indexOf("is")+3,s3.length()));
// split
		
		String test = "Java:Python:Selenium:C:C++";
		String[] subject = test.split(":");
		for (String s :subject)
		System.out.println(s);
		
	String test1 = "Java||Python||Selenium||C||C++";
	//String[] test2 = test.split("||");//| is special for regular expressions - you need to escape them:
	String[] test2 = test.split("\\|\\|");
		for (String s :test2)
			System.out.println(s);
		
		String s6 = "xXJavaxXwithxXSelenium";
	String s[]=	s6.split("xX");
		System.out.println("0th index is : "+s[0]);
		
		//String to int
		String st = "100";
		int i= Integer.parseInt(st);
		System.out.println(Integer.parseInt(st));
		System.out.println(st+32);
		System.out.println(i+32);
		
		//String to double 
		String sg = "12.33";
		double d=Double.parseDouble(sg);
		System.out.println(d+100);
		
		//int to String 
		int total =100;
		String k= String.valueOf(total);
		System.out.println(k);
		
	}

}
