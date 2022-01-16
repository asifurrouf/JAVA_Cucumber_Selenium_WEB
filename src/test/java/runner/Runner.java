package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/"},plugin = {"html:target/cucumber.html", "pretty"}
        ,glue = {"steps"})
public class Runner {
}