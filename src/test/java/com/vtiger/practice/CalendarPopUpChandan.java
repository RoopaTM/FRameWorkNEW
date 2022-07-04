package com.vtiger.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopUpChandan {
	public static void main(String[] args) throws InterruptedException {
		String month=null;
		String year=null;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.className("hasDatepicker")).click();
		Thread.sleep(2000);
		String requiredMonth="November";
		String requiredYear="2021";
		String requiredDate="30";
		String text = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(text);
		String[] yearandMonth = text.split(" ");
		 month = yearandMonth[0];
		 year= yearandMonth[1];
		while(!(month.equals(requiredMonth)&& year.equals(requiredYear))) {
			//driver.findElement(By.xpath("//span[.='Next']")).click();
			driver.findElement(By.xpath("//span[.='Prev']")).click();
			String text1 = driver.findElement(By.className("ui-datepicker-title")).getText();
			System.out.println(text1);
			String[] yearandMonth1 = text1.split(" ");
			 month = yearandMonth1[0];
			  year= yearandMonth1[1];
			if(month.equals(requiredMonth) && year.equals(requiredDate)) {
				driver.findElement(By.xpath("//a[.='"+requiredDate+"']")).click();
				break;
			}
		}
		
		driver.quit();
	}

}
