package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features",
				  tags = "@Run",
				  monochrome =true,			
				  glue = "stepdefinitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {
	@AfterClass
    public static void cleanDriver(){
        BasePage.closeBrowser(); 
	}
}
