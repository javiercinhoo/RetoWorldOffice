package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import pages.BasePage;

public class Hooks extends BasePage{
    public Hooks(){
        super(driver);
    }

@After
public void tearDown(Scenario scenario){
    if(scenario.isFailed()){
               
        byte[] screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
        takeSnapShot();         
        scenario.write("Imagen del error: "+ "target/site/serenity/image.png");        
    }
}
}
