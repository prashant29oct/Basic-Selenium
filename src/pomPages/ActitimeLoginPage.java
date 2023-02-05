package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {
	//Declaration of elements
	@FindBy(className = "atLogoImg") private WebElement logo;
	@FindBy(id = "username") private WebElement usernameTF;
	@FindBy(name = "pwd") private WebElement passwordTF;
	@FindBy(id = "keepLoggedInCheckBox") private WebElement keepMeLoggedCheckBox;
	@FindBy(id = "loginButton") private WebElement loginButton;
	@FindBy(partialLinkText = "Forgot your password?") private WebElement forgotPasswordLink;
	
	
	public ActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getLogo()
	{
		return logo;
	}
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
	}
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}
    public void clickCheckbox() {
    	keepMeLoggedCheckBox.click();
    }
}
