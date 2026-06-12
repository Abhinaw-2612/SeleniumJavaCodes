package com.Chase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChase {
	WebDriver driver;

	public LoginChase(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "userId-text-input-field")
	WebElement username;
	@FindBy(id = "password-text-input-field")
	WebElement password;
	@FindBy(id="signin-button")
	WebElement loginbtn;

	public void login_PractiseTest(String uname, String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}