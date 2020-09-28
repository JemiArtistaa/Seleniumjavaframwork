package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	public WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory. initElements(driver,this); 
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement FirstName;
	
	public void enterFirstName(String fName) {
		FirstName.sendKeys(fName);
	}
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement LastName;
	
	public void enterLastName(String lName) {
		LastName.sendKeys(lName);
	}

	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Email;
	
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement Phone;
	
	public void enterPhone(String phone) {
		Phone.sendKeys(phone);
	}

	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password;
	
	public void enterPassword(String pass) {
		Password.sendKeys(pass);
	}
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement ConfirmPassword;
	
	public void confirmPassword(String cpass) {
		ConfirmPassword.sendKeys(cpass);
	}
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement checkAgree;
	
	public void checkAgree() {
		checkAgree.click();
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Submit;
	
	public void clickSubmit() {
		Submit.click();
	}
	
}
