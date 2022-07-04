package com.vtiger.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDisableElement {
	public static void main(String[] args) throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    
   
   driver.get("file:///C:/Users/CHANDAN%20KUMARa/Q%20spider/Selenium/Disabled.html");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value=arguments[1]", driver.findElement(By.id("t1")),"admin");
	//js.executeScript("document.getElementById('t1').value='chandankumar'");
    //js.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[.='I am disabled!']")));
	}
}
