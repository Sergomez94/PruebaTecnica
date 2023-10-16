package pt.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


 
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features"
,tags="@PruebaTecnica"
,snippets=SnippetType.CAMELCASE
,glue="pt.pruebaTecnica")

public class RunnerCucumber {


}
