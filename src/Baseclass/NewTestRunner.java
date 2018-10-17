package Baseclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/Task/NewBank.feature", 
					dryRun=true, 
					glue= {"Task"},
					monochrome=true,
					strict=true,
					plugin= {"html:Target"})

public class NewTestRunner {

}
