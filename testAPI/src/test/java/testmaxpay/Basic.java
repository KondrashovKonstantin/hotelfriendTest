package testmaxpay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Basic {
    WebDriver driver;
    WebDriverWait wait;
    String emailCorrect = "test.qry@gmail.com";
    String passwordCorrect = "WV8JQtqcjBMpk4j";
    public void sets(WebDriver driver){
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://my-sandbox.maxpay.com");
    }
}
