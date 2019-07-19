package testmaxpay;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestActionsLogin extends MethodsLogin {
    public TestActionsLogin(WebDriver driver){
        this.driver=driver;
        this.wait=new WebDriverWait(driver,10);
    }
    public void login(String email, String password){
        setEmail(email);
        setPassword(password);
        clickSignIn();
    }
    public void checkEmailError(){
        Assert.assertEquals("Please enter a valid email address.",getEmailError());
    }
    public void checkPasswordError(){
        Assert.assertEquals("Please provide a password",getPasswordError());
    }
    public void checkLoginError(){
        Assert.assertEquals("Password or email are incorrect",getLoginError());
    }
    public void checkLogin(){
        try {
            wait.until(ExpectedConditions.urlToBe("https://my-sandbox.maxpay.com/app.php#/app/dashboard"));
        }
        catch (Throwable exception){
            Assert.fail("Issues with login");
        }
    }



}
