package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,5);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
		WebElement result = driver.findElement(By.id("results"));
		String text =wait.until(ExpectedConditions.elementToBeClickable(result)).getText();
		System.out.println(text);

	}

}
