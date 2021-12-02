package StepDefinitions;

import Utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks extends Utils.DriverUtils{
    @Before
    public void initialiseGuru99() throws IOException {
        StepDefinitionGuru99.driver = initialiseDriver(StepDefinitionGuru99.driver,"chrome");
        String url = CommonUtils.getURL("src/test/resources/Guru99.properties");
        StepDefinitionGuru99.driver.get(url);
    }
    @After
    public void closeGuru99(){

        StepDefinitionGuru99.driver.close();
    }


}