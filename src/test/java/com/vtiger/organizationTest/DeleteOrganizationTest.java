
package com.vtiger.organizationTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.SDET34L1.genricutility.BaseClass;
import com.vtiger.ObjectRep.CreateNewOrganizationPage;
import com.vtiger.ObjectRep.OrganizationPage;

public class DeleteOrganizationTest extends BaseClass {
	@Test
	 public void deletOrganizationTest() throws IOException, InterruptedException {
		
		OrganizationPage op = new OrganizationPage(driver);
		CreateNewOrganizationPage cnop = new CreateNewOrganizationPage(driver);
		String OraganizationName = msExcelUtility.getDataFromExcel("Organization",2 , 1)+Random;
		hp.homePageOrganizationAction();	
		op.createNewOrganization();
		cnop.enterTheOrganizationName(OraganizationName);
		cnop.saveTheOrganization();
		Thread.sleep(2000);
		hp.homePageOrganizationAction();
		op.organizationSearchTxt(OraganizationName);
		Thread.sleep(5000);
		op.colunameDropDown();
		op.columNameByvalueOrganizationName();
		op.searchNowBtn();
		Thread.sleep(5000);
		op.selectOrganization();
		op.deleteBtn();
		
		webDriverUtility.alert(driver);
		
		
	}
	

}
