package com.java.exercises;

 class Movie{
	 String title;
	 String Genre;
	 int rating;
	 void play(){
		 System.out.println("Play video");
	 }
 }
 public class classAndObject{
	 public static void main(String[] args) {
		Movie drive=new Movie();
		drive.title="The Napolean By Chiru";
		drive.Genre="Action";
		drive.rating=10;
		Movie Driven=new Movie();
		Driven.title="Kathilantadodu ";
		Driven.Genre="Action";
		Driven.rating=10;
		Driven.play();
		
	}
 }
