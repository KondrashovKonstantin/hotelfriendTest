package testmaxpay;

import org.openqa.selenium.By;


public class LocatorsLogin extends Basic{

   public By emailField(){
       return By.id("login-email");
   }
   public By passwordField(){
       return By.id("login-password");
   }
   public By signInBtn(){
       return By.xpath("//button[@type='submit']");
   }
   public By emailErrorMessage(){
       return By.id("login-email-error");
   }
   public By passwordErrorMessage(){
       return By.id("login-password-error");
   }
   public By signInErrorMessage(){
       return By.xpath("//*[@class='alert alert-danger alert-dismissable push-15']");
   }

}
