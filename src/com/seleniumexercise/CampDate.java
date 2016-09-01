package com.seleniumexercise;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CampDate {
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver myTestDriver = new FirefoxDriver();
		myTestDriver.manage().window().maximize();
		myTestDriver.get("http://jqueryui.com/demos/datepicker/");
	
		myTestDriver.findElement(By.id("datepicker")).click();
		 
		for(int i=2;i<=5;i++){

			for(int j = 1;j<=7;j++){

				System.out.print(myTestDriver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr["+i+"]/td["+j+"]")).getText()+"-");

			}
			System.out.println();
		}

		myTestDriver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[3]")).click();

		System.out.println(myTestDriver.findElement(By.id("datepicker")).getAttribute("value"));

	}
	 }
 

 
