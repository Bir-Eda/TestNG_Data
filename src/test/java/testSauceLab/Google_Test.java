package testSauceLab;

import drivers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class Google_Test {
    public static final String USERNAME="";
    public static final String ACCESS_KEY= "4f22b9da-14fe-4c0c-a22c-f6c8ac7002cd";
    public static final String URL= "https://"+USERNAME+":"+ACCESS_KEY+"@ondemand.us-west-1.saucelabs.com:443/wd/hub";

    WebDriver driver;

    @Parameters({"browser", "version", "platform"})
    @BeforeClass
    public void setUp(String br, String vr, String pf) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities() ;         // baglantiyi saglayan class
        capabilities.setCapability("browserName",br);
        capabilities.setCapability("version", vr);
        capabilities.setCapability("platform", pf);
        driver=new RemoteWebDriver(new URL(URL),capabilities);

    }
    @Test(priority=1)
    public void verifyingGoogleTitle(){
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");
    }

    @Test(priority = 2)
    public void clickGmail(){
        driver.findElement(By.xpath("//*[text()='Gmail']")).click();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
