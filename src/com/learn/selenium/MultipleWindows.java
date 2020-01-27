package com.learn.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
			
		Set<String> windowID = driver.getWindowHandles();
		Iterator<String> it = windowID.iterator();
		String ParentID = it.next();
		String ChildID = it.next();
		
		driver.switchTo().window(ChildID);
		String childText = driver.findElement(By.xpath("//h3[text()='New Window']")).getText();
		System.out.println("In child window now");
		System.out.println(childText);
		
		driver.switchTo().window(ParentID);
		String parentText = driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText();
		System.out.println("In parent window now");
		System.out.println(parentText);
		
		driver.quit();
		
	}

}
