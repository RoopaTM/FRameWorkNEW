package com.vtiger.practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromePoint {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.navigate().to("https://www.facebook.com");
	 driver.navigate().refresh();
	 Point p = new Point(200,300); 
	 driver.manage().window().setPosition(p);
}
}
