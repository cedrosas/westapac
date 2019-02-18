import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html"},
        features = {"src/main/resources/features"}
        //glue = {"stepDefinition"},
        //snippets = SnippetType.CAMELCASE
)


public class TestRunner{
}