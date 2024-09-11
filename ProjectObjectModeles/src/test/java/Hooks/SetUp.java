package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SetUp {
	
	public static WebDriver driver; 
	@Before
	public void initial () {
		driver= DriverManager.GetDriver();
		
	}
	//@BeforeStep
	//public void afficher_etape_en_cour() {
	//System.out.println("etape en cour de d'execution");
		
//	}
	

	@AfterStep
	public void TakeScreenshot(Scenario scenario) {
	    final byte [] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    scenario.attach(screenshot,"image/png", "image");
	    }
	@After
	public void finish( ) { 
		driver.close();
	}

}
