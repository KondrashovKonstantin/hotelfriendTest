package testmaxpay;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassLogin extends TestActionsLogin {
    public TestClassLogin(){
        super(new ChromeDriver());
    }
    @Before
    public void  setUp() {
        sets(driver);
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void InvalidEmailTest(){
        login("invalid_email", passwordCorrect);
        checkEmailError();
    }
    @Test
    public void emptyEmail(){
        login("",passwordCorrect);
        checkEmailError();
    }
    @Test
    public void emptyEmailEmptyPasswordTest(){
        login("","");
        checkPasswordError();
        checkEmailError();
    }
    @Test
    public void incorrectCredentials(){
        login("valid@incorrect.email","password");
        checkLoginError();
    }
    @Test
    public void correctEmailIncorrectPasswordTest(){
        login(emailCorrect,"password");
        checkLoginError();
    }
    @Test
    public void correctEmailEmptyPasswordTest(){
        login(emailCorrect,"");
        checkPasswordError();
    }
    @Test
    public void loginPositiveTest(){
        login(emailCorrect,passwordCorrect);
        checkLogin();
    }



}
