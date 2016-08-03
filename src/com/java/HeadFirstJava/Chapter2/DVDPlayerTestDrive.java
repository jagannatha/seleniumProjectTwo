package com.java.HeadFirstJava.Chapter2;
class DVDPlayer{
	boolean canRecord=false;
	void playDVD(){
		System.out.println("Playing DVD");
	}
	void recordDVD(){
		System.out.println("Dvd Recording");
	}
}
public class DVDPlayerTestDrive {
public static void main(String[] args) {
	DVDPlayer player=new DVDPlayer();
	player.canRecord=true;
	player.playDVD();
	if(player.canRecord=true){
		player.recordDVD();
	}
}
}
