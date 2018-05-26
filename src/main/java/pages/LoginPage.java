package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



import wdMethods.ProjectMethods;

public class LoginPage extends ProjectMethods {
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
    
	
	@FindBy(how=How.ID, using="country")
	private WebElement country;
	public LoginPage selectCountry(){
		selectDropDownUsingText(country, " India");
		return this;
	}
	
	@FindBy(how=How.ID, using="email")
	private WebElement email;
	public LoginPage enterEmail(String data){
		type(email, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="password")
	private WebElement password;
	public LoginPage enterPassword(String data){
		type(password, data);
		return this;
	}
	
	@FindBy(how=How.ID, using="confirmPassword")
	private WebElement confirmPassword;
	public LoginPage enterReconformPassword(String data){
		type(confirmPassword, data);
		return this;
	}
	@FindBy(how=How.ID, using="_eventId_personal")
	private WebElement eleContinue;
	public LoginPage clickContinue(){
		click(eleContinue);
		return this;
	}
	
}
