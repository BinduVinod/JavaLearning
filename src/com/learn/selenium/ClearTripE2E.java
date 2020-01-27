package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ClearTripE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='ui-state-default ui-state-highlight ui-state-active ']")).click();
		
		driver.findElement(By.id("Adults")).click();
		Select ad = new Select(driver.findElement(By.id("Adults")));
		ad.selectByIndex(2);
		
		driver.findElement(By.id("Childrens")).click();
		Select ch = new Select(driver.findElement(By.id("Childrens")));
		ch.selectByIndex(2);
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Indigo");
		driver.findElement(By.id("SearchBtn")).click();
		
		driver.findElement(By.id("homeErrorMessage")).getText();		

	}

}
