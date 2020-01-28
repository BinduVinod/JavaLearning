package com.learn.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.id("product"));
		List<WebElement> rows =table.findElements(By.xpath("//*[@id='product']/tbody/tr"));
		int rowCount = table.findElements(By.xpath("//*[@id='product']/tbody/tr")).size();
		List<WebElement> columns = table.findElements(By.xpath("//*[@id='product']/tbody/tr/th"));
		int columnCount = table.findElements(By.xpath("//*[@id='product']/tbody/tr/th")).size();
		
		System.out.println("Row count =" +rowCount);
		System.out.println("Column count =" +columnCount);
				
		WebElement cell1 =driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[1]"));
		System.out.println(cell1.getText());
		WebElement cell2 =driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[2]"));
		System.out.println(cell2.getText());
		WebElement cell3 =driver.findElement(By.xpath("//*[@id='product']/tbody/tr[3]/td[3]"));
		System.out.println(cell3.getText());
		driver.close();

	}

}
