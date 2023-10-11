package Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	WebDriver driver ;
	
	public void LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


		@FindBy(xpath="//*[@id=\"user-name\"]")
		WebElement userField;
		@FindBy(id = "password")
		WebElement passwordField;
	    @FindBy(id = "login-button")
		WebElement loginButton;
	    @FindBy(xpath = "//h3[@data-test='error']")
		WebElement errorMessage;



	    public void enterUsername(String username) throws InterruptedException {
			Thread.sleep(2000);
	        userField.sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

		 public HomePage clickLoginButton() {
			 loginButton.click();
			 return new HomePage(driver); // Return the next page object }

		 }
	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }

	}


