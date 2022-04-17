package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CucumberTestRunner.TestRunner;

public class LandingPage {

	WebDriver driver;	
	public LandingPage(WebDriver dr) {
			this.driver=dr;
			PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
		}
	
	@FindBy(xpath="//a[contains(.,'Log in')]")
	WebElement lnk_SignIn;
	
	public void clickSignIn() {
		lnk_SignIn.click();
	}
}
