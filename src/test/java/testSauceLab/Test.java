package testSauceLab;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

public class Test {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //driver.get("");

    }
    @DataProvider
    public Object [][] getData(){
        Object [][]data={{"vahit", "celebi","vahit@gmail.com", "2847hfg"},
                {"ali", "kadi","ali@gmail.com","19j75h"}};

        return data;
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}



