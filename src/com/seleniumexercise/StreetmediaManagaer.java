package com.seleniumexercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StreetmediaManagaer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver 	driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(" http://snapooh.com/home.html");
		driver.findElement(By.className("loginBtn")).click();
		driver.findElement(By.id("emailaddress")).sendKeys("info@Snapooh.com");
		driver.findElement(By.id("loginpassword")).sendKeys("12345678");
		driver.findElement(By.id("loginEnter")).click();
		driver.findElement(By.xpath("//a[@id='usrUtils']")).click();
		driver.findElement(By.linkText("Medias")).click();
		
		WebElement element= driver.findElement(By.id("selMediaCity")); 
		Select se=new Select(element);
		se.selectByValue("11");
	}
}


