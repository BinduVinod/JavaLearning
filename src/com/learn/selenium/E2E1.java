package com.learn.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\FILE\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");
		driver.manage().window().maximize();
		
		//click on Option2 check box
		WebElement optionSelect =driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"));
		optionSelect.click();
		String optionText = optionSelect.getText();
		//Select the selected option in the dropdown
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select drop = new Select(dropdown);
		drop.selectByVisibleText(optionText);
		//enter the option in the text box
		driver.findElement(By.id("name")).sendKeys(optionText);
		driver.findElement(By.id("alertbtn")).click();
		//check if the alert message contains the optionText 
		String alertText =driver.switchTo().alert().getText();
		if (alertText.contains(optionText))
		{System.out.println("Alert has the option text ");
		}
		else
		{System.out.println("Alert does not have option text ");
		}
		driver.switchTo().alert().accept();
		driver.close();	

	}

}
