package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory. initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;
	
	public void clickMyAccount() {
		myAccount.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	private WebElement login;
	
	public void clickLogin() {
		login.click();
	}
	
	@FindBy(xpath= "//a[contains(text(),'Register')]")
	private WebElement Register;
	
	public void clickRegister() {
		Register.click();
	}
}
