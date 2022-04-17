package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class HomePage {
	
    WebDriver driver;	
	public HomePage(WebDriver dr) {
		this.driver=dr;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	
	@FindBy(xpath="//a[contains(.,'View Plan')]")
	WebElement lnk_viewPlan;
	
	@FindBy(xpath="//a[contains(.,'Update Plan')]")
	WebElement lnk_updatePlan;
	
	@FindBy(xpath="//a[contains(.,'Log Out')]")
	WebElement lnk_logout;
	
	@FindBy(id="Continue")
	WebElement btn_continue;
	
	@FindBy(id="radiodirectdebit")
	WebElement radio_DD;
	
	@FindBy(id="radiodebitcard")
	WebElement radio_DC;
	
	public void clickViewPlan() {
		lnk_viewPlan.click();
	}
	
	public void clickUpdatePlan() {
		lnk_updatePlan.click();
	}
	
	public void clickContinueBtn() {
		btn_continue.click();
	}
	
	public void clickRadio_DirectDebit() {
		radio_DD.click();
	}
	
	public void clickRadio_DebitCard() {
		radio_DC.click();
	}
	
	public boolean VerifyHomePage() {
		boolean homeFlag=false;		
		homeFlag=lnk_logout.isDisplayed();		
		return homeFlag;
				
	}
	
	public void clickLogOut() {
		lnk_logout.click();
	}
}
