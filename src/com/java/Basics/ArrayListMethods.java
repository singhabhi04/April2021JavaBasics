package com.java.Basics;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	ArrayList<String> alist = new ArrayList<>();
	alist.add("Abhishek");
	alist.add("Abhisha");
	alist.add("Sweta");
	alist.add("Babita");
	alist.add("Randhir");
	System.out.println(alist.size());
	//clear method
	
	alist.clear();
	
	
	System.out.println(alist.size());
	ArrayList<String> alist1 = new ArrayList<>();
	alist1.add("Abhishek");
	alist1.add("Abhisha");
	alist1.add("Sweta");
	alist1.add("Babita");
	alist1.add("Randhir");
	//clone method
	ArrayList<String> alist2 = (ArrayList<String>) alist1.clone();
	System.out.println(alist2);
	//contains
	System.out.println(alist1.contains("Abhishek"));
	System.out.println(alist1.contains("Swetu"));
	//indexOf
	System.out.println(alist1.indexOf("Babita"));
	System.out.println(alist1.indexOf("Babitaaaa"));//-1 if value is not present 
	
	//for each with lambda 1.8
	alist1.forEach(e-> System.out.println(e));
	//sorting
	
	Collections.sort(alist1);
	System.out.println("List after Sorting :"+alist1);
	Collections.sort(alist1,Collections.reverseOrder());
	Collections.sort(alist1); 
	
	
	
	
	}
	
}
