package com.java.HeadFirstJava.Chapter1;

public class testmatch {
public static void main(String[] args) {
	
	int x=0;
	int y=0;
	while(x<5){
		//y=y+x; //match with output 00 11 23 36 410
		//y=x-y;  //00 11 21 32 42 
		y=y+2;
		if(y>4){
			y=y-1;
		}
				
		System.out.println( x+"" +y+ "" );
		x=x+1;
	}
}
	
}
