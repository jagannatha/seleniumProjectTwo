package com.java.HeadFirstJava.Chapter2;

class TapeDeckTestDrive{
				boolean canRecord=false;
					
				void playTape(){
					System.out.println(" Tape Playing");
						}
					void recordTape(){
							System.out.println("Tape Recording");
							}
			}
	public class TapeDeck {
		
				public static void main(String[] args) {
						TapeDeckTestDrive Deck =new TapeDeckTestDrive();
						Deck.canRecord=true;
							Deck.playTape();
								if(Deck.canRecord=true){
										Deck.recordTape();
		 }
	}
 }
