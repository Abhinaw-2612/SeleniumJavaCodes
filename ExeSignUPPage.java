package com.ProfileBrightest.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ExecuteProfileBright.SignupProfileBrightestTest;
import com.Helper.BrowserFactory;



public class ExeSignUPPage {
	
		@Test
		public void CheckValidUser() throws Exception {
			 WebDriver driver=BrowserFactory.BrowserOptions("chrome", "https://profile.brightest.org/accounts/signup/");
			 SignupProfileBrightestTest SignupPage = PageFactory.initElements(driver, SignupProfileBrightestTest.class);
			 SignupPage.login_PractiseTest("student@gmail", "student@gmail","Password123","Password123");
		 }
	}


