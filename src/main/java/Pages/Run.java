package Pages;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = "src/main/resources/Test.feature",
        glue = {"Pages"}
)
public class Run extends AbstractTestNGCucumberTests {

}
