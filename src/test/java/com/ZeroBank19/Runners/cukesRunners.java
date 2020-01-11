package com.ZeroBank19.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

  plugin = {"pretty", "html:target/default-cucumber-reports", "json:target/cucumber.json", "rerun:target/rerun.txt"},
  features = "src/test/resources/features",
  glue = "com/ZeroBank19/StepDeffinations",
  dryRun = false,

  tags = "@account_types"






)

public class cukesRunners {

}
