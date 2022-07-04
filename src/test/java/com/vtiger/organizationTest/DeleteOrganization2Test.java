package com.vtiger.organizationTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.SDET34L1.genricutility.BaseClass;
import com.vtiger.ObjectRep.CreateNewOrganizationPage;
import com.vtiger.ObjectRep.OrganizationPage;

public class DeleteOrganization2Test extends BaseClass{
	@Test
	public void deleteOrganization2Test() throws IOException, InterruptedException {
	OrganizationPage op = new OrganizationPage(driver);
	CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
	String OraganizationName = msExcelUtility.getDataFromExcel("Organization",2 , 1)+Random;
	hp.homePageOrganizationAction();	
	op.createNewOrganization();
	cnop.enterTheOrganizationName(OraganizationName);
	cnop.saveTheOrganization();
	Thread.sleep(2000);
	hp.homePageOrganizationAction();
	Thread.sleep(2000);
	 String pageNum = driver.findElement(By.xpath("//span[@name='Accounts_listViewCountContainerName']")).getText();
	System.out.println(pageNum);
	String[] page = pageNum.split(" ");
	System.out.println(page[1]);
	int ck = Integer.parseInt(page[1]);
	System.out.println(ck);
	for(int i=1;i<ck;i++)
	{
		List<WebElement> names = driver.findElements(By.xpath("//a[@title='Organizations']"));
		int count=0;
		for(int j=1;j<=names.size()-1; j++) {
			System.out.println(names.get(j).getText());
		if(names.get(j).getText().equals(OraganizationName)) {
			driver.findElement(By.xpath("//table[@class='lvt small']/tbody/tr["+(j+2)+"]/td/input")).click();
			 Thread.sleep(2000);
			 count++;
			 Reporter.log("ck",true);
			 break;
			
		}	
		}
		if(count>=1) {
			break;
		}
		driver.findElement(By.xpath("//img[@src='themes/images/next.gif']")).click();
			
		}
	//op.selectOrganization();
	op.deleteBtn();
     webDriverUtility.alert(driver);
}

}
