package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class AccountPage  extends ProjectMethods{
	
	public AccountPage(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.LINK_TEXT, using="radio-personal")
	private WebElement account;
	public AccountPage verifyAccount(){
		verifySelected(account);
		return this;
	}
	@FindBy(how=How.LINK_TEXT, using="Next")
	private WebElement next;
	public LoginPage clickNext(){
		click(next);
		return new LoginPage();
	}
	

}
