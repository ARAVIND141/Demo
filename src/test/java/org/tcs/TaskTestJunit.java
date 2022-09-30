package org.tcs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class TaskTestJunit {
	
	WebDriver driver;
	@BeforeClass
	public static void browserLaunchcode() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hi\\eclipse-workspace\\saelanium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
	
	}
	
	@Test
	public void test2() {
		
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("ARAVINDKARTHI");
		
		WebElement txtPass = driver.findElement(By.id("password"));
		txtPass.sendKeys("ARAVIND141");
		
		
		
		WebElement btnNew = driver.findElement(By.id("login"));
		
        btnNew.click();
	}
	
	//@AfterClass
	//public static void login() {
		
		
		
		
//	}

//	@Before
//	public void sys() {
//	System.out.println("start");
//	}
//
//	@After
//	public void am() {
//	System.out.println("using");
//	}
//
//
//	@Test
//	public void ecl() {
//		System.out.println("mark1");
//	}
//	@Test
//	public void ec2() {
//		System.out.println("mark1");
//	}
//	@Test
//	public void ec3() {
//		System.out.println("mark1");
//	}
}
