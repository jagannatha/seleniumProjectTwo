package com.java.exercises;
/*Assigning a value of one type to a variable of another type is known as Type Casting.
 * Automatic Type casting take place when,
 * The two types are compatible .
 * The target type is larger than the source type
 *
 */

public class Typecasting {
public static void main(String[] args) {
	int i=11;
	long l=i;
	float f=l;
	System.out.println("Int Value: " +i);
	System.out.println("Float Value: "+f);
	System.out.println("long Value:"+l);
	
	
}
}
