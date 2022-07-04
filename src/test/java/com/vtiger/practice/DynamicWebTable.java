package com.vtiger.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.ObjectRep.HomePage;
import com.vtiger.ObjectRep.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	@Test
	public void dynamicWebTable() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localHost:8888");
		LoginPage loginPage=new LoginPage(driver);
		loginPage.loginAction("admin", "admin");
		HomePage homePage=new HomePage(driver);
		homePage.homePageOrganizationAction();
		List<WebElement> columNames= driver.findElements(By.xpath("//table[@class='lvt small']//a[@class='listFormHeaderLinks']"));
		for(int i=0;i<columNames.size();i++) {
			if(columNames.get(i).getText().equals("Organization Name")) {
			 List<WebElement> OrgNames= driver.findElements(By.xpath("//table[@class='lvt small']//tr//a[@title='Organizations']"));
			 for(WebElement orgName:OrgNames) {
				System.out.println(orgName.getText());
				 
			 }
			}
			
		}

 driver.quit();

	}

}
