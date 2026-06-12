package com.ExecuteProfileBright;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupProfileBrightestTest {
	WebDriver driver;
    public SignupProfileBrightestTest(WebDriver driver) {
 	   this.driver=driver;
    }
    @FindBy(name="email")
    WebElement email;
    @FindBy(name="email2")
    WebElement email2;
    @FindBy(name="password1")
    WebElement password1;
    @FindBy(name="password2")
    WebElement password2;
    @FindBy(xpath="//input[@id='id_i_agree']")
    WebElement checkbox;
    @FindBy(xpath="//button[normalize-space()='Create Account']")
    WebElement CreateAccountbtn;

	 
public void login_PractiseTest(String eml, String eml2 , String pass1,String pass2 ) throws Exception {
	 email.sendKeys(eml);
	 email2.sendKeys(eml2);
	 password1.sendKeys(pass1);
	 password2.sendKeys(pass2);
	 Thread.sleep(5000);
	 checkbox.click();
	 CreateAccountbtn.click();
}
}