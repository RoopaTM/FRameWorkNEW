package com.vtiger.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGPractice  extends TestNGBasicConfiguration{
	@Test(groups = {"smoke","regression"})
	public void step1() {

		// SoftAssert softAssert = new SoftAssert();
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Assert.assertEquals("aba", "aba");
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		//softAssert.fail();
		
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);


	}

	@Test(groups = "sanity")
	public void step2() {
		Reporter.log("Test2",true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Assert.assertEquals("aba", "aba");
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
	}
	@Test(groups = "regression")

	public void step3() {
		Reporter.log("Test3",true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
	}
	@Test(groups = "regression")
	public void step4() {
		Reporter.log("Test4",true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
		Reporter.log("Test1" ,true);
	}

}
