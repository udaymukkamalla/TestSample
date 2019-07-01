package net.serenitybdd.sample;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/consult_dictionary/PartsAndAccessories.feature",
				 glue="net.serenitybdd.sample.steps")
public class DefinitionTestSuite {}
