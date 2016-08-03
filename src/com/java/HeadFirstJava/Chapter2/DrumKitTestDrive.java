package com.java.HeadFirstJava.Chapter2;

class DrumKit{
	
	boolean snare=false;
	void PlaySnare(){
	System.out.println("bang bang bang-bang");	
	}
	boolean tophat=false;
	void PlayTopHat(){
		System.out.println("ding ding da-ding");
	}
}

public class DrumKitTestDrive {
public static void main(String[] args) {
	DrumKit d = new DrumKit();
	d.PlaySnare();
	d.snare=false;
	d.PlayTopHat();
	if(d.snare==true){
		d.PlaySnare();
		 
		
	}
}
 

}
