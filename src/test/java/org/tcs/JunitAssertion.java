package org.tcs;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class JunitAssertion {

	@Test
	 private void Tc1() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver = new ChromeDriver();
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		assertTrue(false);
		System.out.println(4);
		System.out.println(5);
		
		
		//driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		//String currentUrl = driver.getCurrentUrl();
		//boolean contains = currentUrl.contains("facebook");
	//	System.out.println(contains);
	  //  Assert.assertTrue(contains);
	   
	    //WebElement txtEmail = driver.findElement(By.id("Email"));
	    //txtEmail.sendKeys("aravind");
	    
	    
	    	
		

	}
	
	

}
