package StepDefinitions;

import CucumberTestRunner.TestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class UpdatePlan extends TestRunner{

	LandingPage landing=null;
	LoginPage login=null;
	HomePage home = null;
   

	    @Given("Click on view plan on homepage")
	    public void user_click_on_view_plan() throws InterruptedException {
	     Thread.sleep(5000);    
	     home = new HomePage(driver);
	     home.clickViewPlan();
	    }
	    
	    @When("Click on updateplan link on Act Details page")
	    public void user_click_on_updateplan_link() {
	    	home.clickUpdatePlan();
	    }
}
