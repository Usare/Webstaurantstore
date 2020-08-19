package com.webstaurantstore.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        glue = "com/webstaurantstore/steps",
        features = "src/test/resources/features",
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber-report.html"
        },
        tags = "@Webtest",
        dryRun = false


)

public class cucumberRunner {

}
