
package com.vtiger.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HidenDivsionPopupTest {
	@Test
	public void calenderTest() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
	driver.findElement(By.id("datepicker")).click();
	String reqYear = "2022";
	String reqMonth = "November";
	String reqDate = "21";
	String[] current= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");
	String month = current[0];
	System.out.println(month);
	String year = current[1];
	System.out.println(year);
	//String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	//String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
	while(!(year.equals(reqYear)&& month.equals(reqMonth)))
	{
		System.out.println("cksss");
		driver.findElement(By.xpath("//span[.='Next']")).click();
		String[] current1= driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().split(" ");
		 month = current1[0];
		System.out.println(month);
		 year= current[1];
		System.out.println(year);
		if((year.equals(reqYear)&& month.equals(reqMonth)))
				{
	
			driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='"+reqDate+"']")).click();
			break;
		}
	}
	
	
	
		
		
	}

}
