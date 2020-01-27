package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.salesforce.com/");
		
		driver.findElement(By.cssSelector("#username")).sendKeys("ABCD");
		driver.findElement(By.xpath("//*[@name='pw']")).sendKeys("sdhshd");
		driver.findElement(By.xpath("//*[contains(@value,'Log In to Sandbox')]")).click();
		

	}

}