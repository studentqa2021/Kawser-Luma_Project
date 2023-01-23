package com.test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin   = { "pretty", "html:target/site/cucumber-pretty.html", "rerun:target/rerun.txt",
					"json:target/cucumber.json" }, 
		features = {"src/main/resources/Login Test.feature" }, 
		glue     = { "com.test.cucumber" },
		monochrome = true
		//dryRun = false
		//strict = true
)
public class Runner extends AbstractTestNGCucumberTests {

}
