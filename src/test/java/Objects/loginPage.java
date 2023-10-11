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
	
		@FindBy(id = "user-name")
	    private WebElement usernameField;
	    
		@FindBy(id = "password")
	    private WebElement passwordField;
	    
	    @FindBy(id = "login-button")
	    private WebElement loginButton;
	    
	    @FindBy(xpath = "h3[data-test='error']")
	    private WebElement errorMessage;

	    // Create a constructor that initializes the web elements
	    

	    // Define the methods that perform actions on the web elements
	    public void enterUsername(String username) {
	        usernameField.sendKeys(username);
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


