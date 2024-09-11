package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			tags="@Achat",
			features="src/test/features/Test",
			glue={"Hooks","SetepDefinition"},
			publish =true,
			plugin= {"pretty","html:target/reportTest.html","json:target/reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)





	public class runner {
		
	}
	


