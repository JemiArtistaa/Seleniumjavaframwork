package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.BaseClass;

public class TwoTest extends BaseClass{

	public WebDriver driver;
	
	public Logger log;
	
	@Test
	public void twoTestDemo() throws IOException, InterruptedException {
		
		log = LogManager.getLogger(TwoTest.class.getName());

		driver= initializebrowser();
		log.debug("Browser opened");

		driver.get(prop.getProperty("url1"));
		log.debug("Navigated to desired URL");
//		LandingPage landingpage = new LandingPage(driver);
//		
//		landingpage.clickMyAccount();
//		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
//
//		landingpage.clickRegister();
//		
//		RegistrationPage regpage = new RegistrationPage(driver);
//		
//		regpage.enterFirstName(prop.getProperty("firstName"));
//		regpage.enterLastName(prop.getProperty("lastName"));
//		regpage.enterEmail(prop.getProperty("email"));
//		regpage.enterPhone(prop.getProperty("phone"));
//		regpage.enterPassword(prop.getProperty("password"));
//		regpage.confirmPassword(prop.getProperty("confirmPassword"));
//		regpage.checkAgree();
//		regpage.clickSubmit();
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.clickMyAccount();
		log.debug("Clicked MyAccount");

//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		Thread.sleep(1000);

		
		landingpage.clickLogin();
		log.debug("Clicked logIn");

//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		Thread.sleep(1000);

		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.enterEmail(prop.getProperty("email1"));
		log.debug("Email Entered");

		loginpage.enterPassword(prop.getProperty("password"));
		log.debug("Password Entered");
		
		loginpage.clickLogin();
		log.debug("Submit clicked");
//		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
		Thread.sleep(1000);
		
		WebElement element = loginpage.isLogoutPresent();
		if (element == null) {
			log.debug("logout not displayed");
			Assert.assertTrue(false);
		}
		else if(element!= null){
			log.debug("logout displayed");
			Assert.assertTrue(true);
		}
		
	}
	
}

