package testmaxpay;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class MethodsLogin extends LocatorsLogin {
    public void setEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(emailField())).sendKeys(email);
    }
    public void setPassword(String password){
        wait.until(ExpectedConditions.elementToBeClickable(passwordField())).sendKeys(password);
    }
    public String getEmailError(){
        String errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(emailErrorMessage())).getText();
        return errorMessage;
    }
    public String getPasswordError(){
        String errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordErrorMessage())).getText();
        return errorMessage;
    }
    public String getLoginError(){
        String errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(signInErrorMessage())).getText();
        return errorMessage;
    }
    public void clickSignIn(){
        wait.until(ExpectedConditions.elementToBeClickable(signInBtn())).click();
    }
}
