package com.seleniumproj.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class webdriverTest {
	
	WebDriver driver;
	 @Test
	 public void test() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahesh Samudrala\\Desktop\\StackRoute\\Test automation\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.get("http://www.facebook.com");
	   driver.findElement(By.id("email")).sendKeys("hello world");
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys ("hello123");
	 }
	 
	 @AfterTest
	 public void test1()
	 {
		 driver.close();
	 }

}
