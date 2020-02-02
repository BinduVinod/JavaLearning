package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("IND");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String script =  "return document.getElementById(\"autocomplete\").value;";
		String text= (String)js.executeScript(script);
		
		int i=0;
		while(!text.equalsIgnoreCase("INDIA"))
		{
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
			text= (String)js.executeScript(script);		
			i++;
			if(i>10)
			{System.out.println("Element not found");}
						
		}
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);	
		driver.close();	
		
	}

}
