package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import wdMethods.ProjectMethods;

public class TC001_PayPalLogin extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_PayPalLogin";
		testDescription="create login";
		testNodes="Leads";
		category="Smoke";
		authors="Gayatri";
		browserName="chrome";
		dataSheetName="TC001";
	}
    @Test(dataProvider="fetchData")
	public void payPalLogin(String email, String pwd, String repwd){
	new HomePage()
	
	.clickSignup()
	//.verifyAccount()
	.clickNext()
	//.selectCountry()
	.enterEmail(email)
	.enterPassword(pwd)
	.enterReconformPassword(repwd)
	.clickContinue();
	
    }
	

}
