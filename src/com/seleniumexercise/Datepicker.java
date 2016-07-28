package com.seleniumexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Datepicker {
public static void main(String[] args) {
	
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://only-testing-blog.blogspot.in/2014/09/selectable.html");
	
	
}
}
