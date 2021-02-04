package testSauceLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class SeleniumMethods3 {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("");
    }
    @Test
    public void softAssert(){
        // hard Assert
        int x=2;
        int y=5;
//        Assert.assertEquals(x+y, "8");
//        System.out.println("Birsen");

        // soft assert
        SoftAssert soft=new SoftAssert();
        soft.assertEquals(x+y, 8);
        System.out.println("Esra");
        //soft.assertAll();  // hatayi vermesi icin yaziyoruz

    }
    @Test
    public void highlightAnElementFlash(WebElement element, WebDriver driver){
        JavascriptExecutor js=((JavascriptExecutor)driver);
        String backgroundColor=element.getCssValue("backgroundColor");
        for(int i=0; i<10; i++){
            // changeColor() metodunu daha once baska bir yerde create edip buraya cagiriyoruz
           // changeColor("rgb(0,200,0)", element,driver);
           // changeColor(backgroundColor, element, driver);
        }

    }
    @Test
    public void handleDynamicElements(){
        // how to test dynamic web page ve dynamic table da ayni sekildehandle ediliyor
        //*[contains(@name,'btn')]
        //*[startwith(@id,'message')]
        //*[text()=usedId']
        //*[@type='submit' and @name='login']
    }
    @Test
    public void maximizeWindow(){
        driver.manage().window().maximize();   // if does not work
        ChromeOptions op= new ChromeOptions();  // we will try ChromeOptions class
        op.addArguments("startmaximized");

    }
    @Test
    public void dynamicPopUpRandomly(){
        // I use try and catch block
    }
    @Test
    public void scrollDownAndScrollUp(WebDriver driver){
        //scrollDown
        JavascriptExecutor js=((JavascriptExecutor)driver);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        //scrollUp
        JavascriptExecutor jsc=((JavascriptExecutor)driver);
        jsc.executeScript("scroll(0,-250)");

    }

    @Test
    public void handleCookies(){
        driver.manage().deleteAllCookies();
        // if we do not handle cookies, it will increase our codes effort
        // and execution tome. we need to store cookies in a file
    }

    @Test
    public void resizeBrowser(){
        // I use Dimension class to handle this issue
        Dimension dimension=new Dimension(450, 590);
        driver.manage().window().setSize(dimension);

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

