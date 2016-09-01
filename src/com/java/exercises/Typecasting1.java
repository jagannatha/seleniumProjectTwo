package com.java.exercises;


/*
 * Narrowing or Explicit type conversion 
 * When you are assigning a larger type value to a variable of smaller type,
 *  then you need to perform explicit type casting.
 */
public class Typecasting1 {
public static void main(String[] args) {
	
	double d=100.04;
	long l=(long)d;
	float f=(float)d;
System.out.println("Double value is"+d);
System.out.println("Long Value iS"+l);
System.out.println("Float value is:"+f);
}
}
