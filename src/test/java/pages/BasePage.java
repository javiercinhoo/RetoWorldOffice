package pages;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;   

    static {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();        
        driver = new ChromeDriver(chromeOptions);         
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();                   
    }     
    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);     
    }
    public static void navigateTo(String url) {       
        driver.get(url);      
    }
    public static void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
    private WebElement Find(String locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }          

    public void clickElement(String locator) {
        Find(locator).click();
    }
    
    public void write(String locator, String textoToWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textoToWrite);
    } 

    public String textFromElement(String locator){
        return Find(locator).getText();
    }

    public void moveScroll(){      
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)");    
    }
    
    public static void takeSnapShot(){
        try {            
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File("C:/VisualCode/RetoWorldOffice/target/site/serenity/image.png");
            FileUtils.copyFile(SrcFile, DestFile);      
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }    
    
}