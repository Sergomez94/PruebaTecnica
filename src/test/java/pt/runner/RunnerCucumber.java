package pt.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.annotations.Managed;

 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features"
,tags="@registrarseEnPagina"
,snippets=SnippetType.CAMELCASE
,glue="pt.pruebaTecnica")

public class RunnerCucumber {


}
