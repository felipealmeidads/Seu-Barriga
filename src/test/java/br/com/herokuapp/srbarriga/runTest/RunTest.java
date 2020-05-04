package br.com.herokuapp.srbarriga.runTest;

import br.com.herokuapp.srbarriga.commons.BaseTest;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = { "pretty", "json:target/cucumber.json" },
        features = { ".//src//test//resources//features" },
        glue = { "br.com.herokuapp.srbarriga.steps.web", "br.com.herokuapp.srbarriga.configuration" },
        tags = {""})


public class RunTest extends BaseTest {

    @AfterClass
    public static void AfterTests() {
        if(webDriver != null) {
            closeWeb();
        }
    }
}
