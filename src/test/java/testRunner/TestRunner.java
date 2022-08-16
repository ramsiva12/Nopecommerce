package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions
       (
        features=".//Features/AddCustomer.feature",
        glue="stepDefinition",
        monochrome=true,
        dryRun=false,
        plugin= {"pretty","html:target/test-output.html"}
    		   
       )


public class TestRunner {
	
	

}
