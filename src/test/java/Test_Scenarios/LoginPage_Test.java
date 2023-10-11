package Test_Scenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.loginPage;

import java.util.concurrent.TimeUnit;

public class LoginPage_Test {


	    private WebDriver driver;
    	loginPage loginPage = new loginPage();

	    @BeforeTest
	    public void setUp() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	  
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
			PageFactory.initElements(driver, loginPage);
	        driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

	    @Test
	    public void testLoginWithValidCredentials() throws InterruptedException {
			loginPage.enterUsername("standard_user");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLoginButton();
			String expectedInvintoryPage = "https://www.saucedemo.com/inventory.html";
			String actualUrl = driver.getCurrentUrl();
			Assert.assertEquals(actualUrl, expectedInvintoryPage, "UserNotAbleToLogin");
	    }
	    @Test
	    public void testLoginWithInValidCredentials() throws InterruptedException {
			loginPage.enterUsername("erroruser");
			loginPage.enterPassword("secret_sauce");
			loginPage.clickLoginButton();
			Thread.sleep(2000);
			String ActualErrorMassage = loginPage.getErrorMessage();
			String ExpectedErrorMassage = "Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(ActualErrorMassage, ExpectedErrorMassage, "ErrorMassegeForInvalidCredientalsNotMatched");
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	
}
