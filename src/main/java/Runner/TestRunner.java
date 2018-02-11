package Runner;

import org.junit.runner.RunWith;




import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format={"pretty", "html:target/Destination"},
        features = "E:\\eclipse-workspace\\Cucumber_Maven\\src\\main\\java\\Feature",
        glue = {"StepDefinitions"})



public class TestRunner {

}
