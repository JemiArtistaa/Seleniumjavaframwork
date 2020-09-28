package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@id='input-email']")
	private WebElement email;
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	@FindBy(xpath= "//input[@id='input-password']")
	private WebElement password;
	
	public void enterPassword(String pword) {
		this.password.sendKeys(pword);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement login;
	
	public void clickLogin() {
		login.click();
	}
	
	public WebElement isLogoutPresent() {
		try{
			WebElement logoutPresent = driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[contains(text(),'Logout')]"));
			return logoutPresent;
		}catch(NoSuchElementException e) {
			return null;
		}
	}
	
}
