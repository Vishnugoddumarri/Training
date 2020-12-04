package cucumberProject;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/cucumberProject/login.feature"}
        , glue={"cucumberProject"}

)

public class TestRunner extends AbstractTestNGCucumberTests {



}
