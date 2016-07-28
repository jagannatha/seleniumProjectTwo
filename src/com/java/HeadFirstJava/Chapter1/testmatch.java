package com.java.HeadFirstJava.Chapter1;

public class testmatch {
	public static void main(String[] args) {

		int x=0;
		int y=0;
		while(x<5){
			//	Option1	y=y+x; //match with output 00 11 23 36 410
			//	Option 2	y=x-y;  //00 11 21 32 42 
			//	option 3	y=y+2;//02 14 25 36 47

			//		if(y>4){
			//			y=y-1;
			//		}

			System.out.println( x+"" +y+ "" );
			x=x+1;
		}
	}

}
