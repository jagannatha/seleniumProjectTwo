package com.seleniumexercise;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
	driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(" http://192.168.1.10:8080/sptest/home.html");
		driver.findElement(By.xpath("//span[@class='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='emailaddress']")).sendKeys("abc@snapooh.com");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("87654321");
		driver.findElement(By.xpath("//input[@id='loginEnter']")).click();
		driver.findElement(By.xpath("//a[@id='usrUtils']")).click();
		driver.findElement(By.xpath("//a[contains(.,'Campaigns')]")).click();
		driver.findElement(By.xpath("//label[contains(.,'Create Campaign ')]")).click();
		driver.findElement(By.xpath("//input[@id='campnNameInput']")).sendKeys("Jagannatha");
		driver.findElement(By.xpath("//input[@id='campnClientNameInput']")).sendKeys("TestAAAA");
		driver.findElement(By.xpath("//textarea[@class='longTxt']")).sendKeys("Hemanth");
		driver.findElement(By.xpath(".//*[@id='campnStartInput']")).click();
  		WebElement   datepicker = driver.findElement(By.id("ui-datepicker-div"));  
   		List<WebElement> rows=  datepicker.findElements(By.tagName("tr"));  
  		List<WebElement> columns= datepicker.findElements(By.tagName("td"));  
  							
  						for (WebElement cell: columns){  
  							//Select 20th Date   
  							if (cell.getText().equals("27")){  
  								cell.findElement(By.linkText("27")).click();   
  									break;
  							}  
  								}   
  			
  						driver.findElement(By.xpath(".//*[@id='campnEndInput']")).click();
  						WebElement   datepicker1 = driver.findElement(By.id("ui-datepicker-div"));  
  						List<WebElement> rows1=  datepicker1.findElements(By.tagName("tr"));  
  						List<WebElement> columns1= datepicker1.findElements(By.tagName("td"));  
  						for (WebElement cell: columns1){  
	      				//Select 20th Date   
  							if (cell.getText().equals("30")){  
  								cell.findElement(By.linkText("30")).click();   
  									break;
  							}  
  								}   
  						driver.findElement(By.id("createAndUpdateCampaign")).click();
  				      	System.out.println("Campaign Created");
  			 driver.findElement(By.className("campaignId")).click();
  			 System.out.println("Campaign Selected");
  			 //Street Media Selectotr popup
  			driver.findElement(By.xpath(".//*[@id='addNewStreetMedia']")).click();;
  			Thread.sleep(5000);
  			
  			 WebElement element = driver.findElement(By.id("filterCityList"));
             if (element.isEnabled()) {
                   WebElement dropdown = driver.findElement(By.id("filterCityList"));
                   Select select = new Select(dropdown);
                   String str = dropdown.getText();
                   List<WebElement> options = select.getOptions();
                   for (WebElement we : options) {
                         if (we.getText().equals("4")) {
                               we.click();
                               break;
                         }
                   }
             } else {
                   System.out.println("Object is disabled");
             }
  			 
  			 
	      }
	}
