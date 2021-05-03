package com.java.Basics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		
		//dynamic array - growable in nature
		//insertion order is preserved
		//duplicates are allowed
		//null is also allowed
		//initial capacity is 10
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		System.out.println(al.size());
		al.add(100);
		al.add(567);
		al.add(null);
		al.add(345);
		al.add(1020);
		al.add(2060);
		al.add(1020);
		al.add(2060);
		al.add(2080);
		System.out.println(al.get(2));
		
		System.out.println(al.size());	
		//for loop in ArrayList
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//System.out.println(al.get(12));//java.lang.IndexOutOfBoundsException: 
		al.remove(3);
		System.out.println(al.size());	
		//for each loop in Array List 
		for(Object e :al) {
			System.out.println(e);
		}
	}

}
