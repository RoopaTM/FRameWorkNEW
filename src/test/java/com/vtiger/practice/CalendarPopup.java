package com.vtiger.practice;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalendarPopup {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		driver.findElement(By.id("datepicker")).click();
		 String reqDate = "30";
		 String reqMonth = "August";
		 String reqYear = "2020";
		 int reqMOnthOfYear = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(reqMonth).get(ChronoField.MONTH_OF_YEAR);
		 int reqYearInNumber= Integer.parseInt(reqYear);
		 String[] currentMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText().split(" ");
		 String currentMonth = currentMonthYear[0];
		 int curentMonthOfYear = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(reqMonth).get(ChronoField.MONTH_OF_YEAR);
		 String currentYear = currentMonthYear[1];
		 int currentYearinNumber =Integer.parseInt(currentYear);
		 
		 while(reqYearInNumber>=currentYearinNumber || reqMOnthOfYear>=curentMonthOfYear) {
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			 currentMonthYear =driver.findElement(By.className("ui-datepicker-title")).getText().split(" ");
			 
			 currentMonth = currentMonthYear[0];
			curentMonthOfYear = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(reqMonth).get(ChronoField.MONTH_OF_YEAR);
			 currentYear = currentMonthYear[1];
			currentYearinNumber =Integer.parseInt(currentYear);
			break;
		 }
		 
		 while(reqYearInNumber>=currentYearinNumber || reqMOnthOfYear>=curentMonthOfYear) {
			 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			 currentMonthYear =driver.findElement(By.className("ui-datepicker-title")).getText().split(" ");
			 
			 currentMonth = currentMonthYear[0];
			curentMonthOfYear = DateTimeFormatter.ofPattern("MMMM").withLocale(Locale.ENGLISH).parse(reqMonth).get(ChronoField.MONTH_OF_YEAR);
			 currentYear = currentMonthYear[1];
			currentYearinNumber =Integer.parseInt(currentYear);
			break;
		 }
		 
		 try {
		 driver.findElement(By.xpath("//a[@class='ui-state-default' and text()='"+reqDate+"']")).click();
		 }
		 catch(Exception e) {
			 System.out.println("Invalid Date Input"+reqDate+"/"+reqMonth+"/"+reqYear+"");
		 }
		 
	}


}
