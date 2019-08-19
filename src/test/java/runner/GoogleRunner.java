package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/main/resources/Google.feature",
snippets = SnippetType.CAMELCASE,
glue = "stepdefinitions",
tags = "@tag1")

public class GoogleRunner {	

}
