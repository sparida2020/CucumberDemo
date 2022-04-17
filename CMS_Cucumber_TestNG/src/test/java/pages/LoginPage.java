package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage {
	
	WebDriver driver;	
	public LoginPage(WebDriver dr) {
		this.driver=dr;
		//AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	@FindBy(id="Username")
	WebElement txt_username;
	
	@FindBy(id="Password")
	WebElement txt_userpwd; 
	
	@FindBy(id="SignInBtn")
	WebElement btn_login; 
	
	
	public void enterUsername(String username) {
		txt_username.clear();
	    txt_username.sendKeys(username);
	}

	public void enterUserpwd(String userpwd) {
		txt_userpwd.clear();
		txt_userpwd.sendKeys(userpwd);
		}
	
	public void clickLogin() {
		btn_login.click();
	}
	
	public void loginValidUser(String username, String userpwd) {
		txt_username.clear();
		txt_username.sendKeys(username);
		txt_userpwd.clear();
		txt_userpwd.sendKeys(userpwd);
		btn_login.click();
	}
	
}
