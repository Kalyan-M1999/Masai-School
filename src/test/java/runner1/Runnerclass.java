package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
	features = {"C:\\Users\\LENOVO\\Documents\\workspace-spring-tool-suite-4-4.22.0.RELEASE\\CucumberDemo\\CumFrom1\\CumFrom1.feature"},
	glue=("Stepformats")
)
public class Runnerclass {
}
