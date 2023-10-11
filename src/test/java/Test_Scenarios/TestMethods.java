package Test_Scenarios;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.loginPage;
public class TestMethods {


	    private WebDriver driver;
    	loginPage loginPage = new loginPage();

	    @BeforeTest
	    public void setUp() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	  
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	        driver.get("https://www.saucedemo.com/");
	    }

	    @Test
	    public void testLogin() {
			loginPage.enterUsername("username");
			loginPage.enterUsername("hamada");
			loginPage.clickLoginButton();

	       
//	        Assert.assertEquals(welcomeMessage.getText(), "Welcome, testuser!");
	    }

	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	
}
