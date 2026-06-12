package com.Chase.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Chase.Pages.LoginChase;

import com.Helper.ChaseBrowserFactory;



public class ExternalChaseTest  {
		@Test
		public void CheckValidUser() {
			 WebDriver driver=ChaseBrowserFactory.BrowserOptions("Edge", "https://www.chase.com/");
			 LoginChase loginPagePracticeAuto = PageFactory.initElements(driver, LoginChase.class);
			 loginPagePracticeAuto.login_PractiseTest("student", "Password123");
		 }
}