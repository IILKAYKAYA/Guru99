package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources",
        glue="StepDefinitions",
        tags ="@SanityTest",
        plugin={"pretty","html:target/test.html"}
)

public class TestRunner {
}