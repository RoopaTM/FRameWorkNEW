package com.vtiger.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.com");
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
      driver.findElement(By.id("nav-search-submit-button")).click();
	}
}
