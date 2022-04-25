package FinalProject.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Users\\Dell\\FinalProject\\src\\test\\resources\\feature"},
        glue = {"FinalProject/steps"},
        tags = "@FinalProject"

)
public class TestRunner {

}
