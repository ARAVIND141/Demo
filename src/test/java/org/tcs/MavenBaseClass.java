package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenBaseClass {
     
	   public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
			
			driver.manage().window().maximize();
			
			WebElement txtUser = driver.findElement(By.id("email"));
			txtUser.sendKeys("ARAVIND");
			
			WebElement txtPass = driver.findElement(By.name("pass"));
			txtPass.sendKeys("12345");
			
			
			
	        WebElement btnNew = driver.findElement(By.xpath("//*[@id=\"u_0_5_BW\"]"));
	        btnNew.click();
	        	

	}
	   
	   
}

