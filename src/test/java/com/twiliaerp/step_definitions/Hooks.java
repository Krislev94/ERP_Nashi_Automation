package com.twiliaerp.step_definitions;




import com.twiliaerp.utilities.BrowserUtils;
import com.twiliaerp.utilities.ConfigurationReader;
import com.twiliaerp.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

/*
In this class we will be able to create "pre" and "post" condition
for ALL the SCENARIOS and even STEPS.
 */
public class Hooks {
    /*

        /*
        @After will be executed automatically after EVERY scenario in the project.
         */
    @After
    public void teardownMethod(Scenario scenario){

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }



        Driver.closeDriver();

    }

    @Before
    public void setupMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    @BeforeStep
    public void setupStep(){
       // System.out.println("-----> @BeforeSTEP : Running before each step!");
        BrowserUtils.waitForPageToLoad(10);

    }

    //@AfterStep
    public void teardownStep(){
        System.out.println("-----> @AfterSTEP : Running after each step!");
        Driver.closeDriver();
    }


}
