package com.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Edit {
  
	@Test	
	public void test() 
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Friends Files\\suresh\\software\\chromedriver1\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeoption);
		driver.get("http://www.leafground.com/");

		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img")).click();

		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.sendKeys("sureshsure33@gmail.com");

		WebElement appandTxtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appandTxtBox.sendKeys("update");

		WebElement getvalueTxtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String getvalue = getvalueTxtBox.getAttribute("value");
		System.out.println("the value of text "+getvalue);

		WebElement clearTxtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		clearTxtBox.clear();

		WebElement disableTxtBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		System.out.println(disableTxtBox.isEnabled());

	}
	
	public void button() {
		
	}

}

