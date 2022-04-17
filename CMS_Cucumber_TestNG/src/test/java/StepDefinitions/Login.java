package StepDefinitions;

import java.util.concurrent.TimeUnit;

import CucumberTestRunner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class Login extends TestRunner{
	
	LandingPage landing=null;
	LoginPage login=null;
	HomePage home = null;
	
    
    @Given("User is on Log in screen")
    public void user_is_on_log_in_screen() {        
        landing = new LandingPage(driver);
        landing.clickSignIn();        
    }

    @When("^User enters username as (.*)$")
    public void user_enters_username(String username) {
        login = new LoginPage(driver);
        login.enterUsername(username);
    }

    @And("^User enters password as (.*)$")
    public void user_enters_password(String userpwd) {
    	login.enterUserpwd(userpwd);

    }
    @And("User clicks on login button")
    public void user_clicks_on_login_button() {
    	login.clickLogin();
    	
    }

    @Then("User navigates to Home page")
    public void user_navigates_to_home_page() { 
    	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
    	home = new HomePage(driver);
    	boolean flag=home.VerifyHomePage();
    	if(flag==true)
		{
		System.out.println("Home Page loaded successfully !!!");
		}
    	else {
		System.out.println("Home Page is not loaded failure !!!");
		}
    }

}
