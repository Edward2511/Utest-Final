package co.com.choucair.certification.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\feature\\Chou.feature",
        glue = "co.com.choucair.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ChouRunner {
}
