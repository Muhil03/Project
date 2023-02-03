package Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Project.Baseclass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\FeatureFile\\Feature_File.feature",glue="Stepdefinition",monochrome=true,				 
				 plugin= {"html:Reports/final_report.html", "json:Reports/cucumber.json", "pretty"
//						 ,"com.cucumber.listener.ExtentCucumberFormatter:Reports/Adactin.html"
						 })

public class Test_Runner {

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {		
		driver = Baseclass.launchbrowser("chrome");
	}
	
	@AfterClass
	public static void tearDown() {
		Baseclass.closetab();
	}
}
