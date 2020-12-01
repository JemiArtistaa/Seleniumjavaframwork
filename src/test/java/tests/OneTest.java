package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import resources.BaseClass;

public class OneTest extends BaseClass{
	
	public WebDriver driver;
	
	@Test
	public void testOneDemo() throws IOException {
		
		driver=initializebrowser();
		driver.get(prop.getProperty("url1"));
		try {
			Assert.assertEquals(driver.getTitle(),"Your Store is not yours");
			System.out.println();
		}catch(Exception e) {
			System.out.println("Error is not yours");
		}
		
	}

}
