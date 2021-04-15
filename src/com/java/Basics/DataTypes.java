package com.java.Basics;

public class DataTypes {
	byte b ; //1 Bytes
	short s; // 2 Bytes
	int i; // 4 Bytes
	long l; //8 Bytes
	float f; //4 Bytes
	double d;// 8 bytes
	char c ='h'; //2 bytes
	boolean bl ;//1 bit
//byte-->short-->int-->long-->float-->double
			//-->char	
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		System.out.println(dt.b);
		System.out.println(dt.s);
		System.out.println(dt.i);
		System.out.println(dt.f);
		System.out.println(dt.d);
		System.out.println(dt.c);
		System.out.println(dt.bl);

	}

}
