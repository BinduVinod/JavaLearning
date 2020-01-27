package com.learn.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		//April 23
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();

		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}


		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=dates.size();

		for(int i=0;i<count;i++)
		{
		String text=dates.get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		dates.get(i).click();
		break;
		}

		}
		driver.close();	
	}
	

		

	}


