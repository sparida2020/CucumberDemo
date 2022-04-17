package CucumberTestRunner;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(tags = "@SmokeScenario", features = "src/test/resources/Features",glue = {"StepDefinitions"},
monochrome=true , plugin= {"pretty","junit:target/cucumber/report.xml", 
	"json:target/cucumber/report.json",
	"html:target/cucumber/report.html"})
public class TestRunner {
	public static WebDriver driver = null;
	static String projPath= System.getProperty("user.dir");	
	static String br ="chrome";
	
	@BeforeClass
	public static void setUp() {
		System.out.println("Project path is: "+projPath);
		
		if(br.equalsIgnoreCase("chrome")) {    	
			System.setProperty("webdriver.chrome.driver", projPath+"/src/test/resources/drivers/chromedriver.exe"); 
			driver = new ChromeDriver(); 
	    }
		else if(br.equalsIgnoreCase("firefox")){    		
			String brPath =projPath+"/src/test/resources/drivers/geckodriver.exe";
			System.out.println(brPath);
			System.setProperty("webdriver.gecko.driver", brPath); 
			 driver = new FirefoxDriver(); 
	    }else {
	    	System.out.println("No Browser Selected !!!");
	    }
		          
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://portal.lowell.co.uk/");
	}
	
	@AfterClass
    public static void teardown() {
 
        driver.quit();
    }
}
