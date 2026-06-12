package com.PracticeAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrowserFactory;
import com.PracticeAutomation.Pages.LoginPracticeAutomation;

public class ExecutePracticeAutomationLogin {

    @Test
    public void loginTest() {
        
        // Initialize browser with correct URL
        WebDriver driver = BrowserFactory.BrowserOptions(
                "chrome",
                "https://practicetestautomation.com/practice-test-login/"
        );

        // Initialize Page Object
        LoginPracticeAutomation loginPageEasyCal =
                PageFactory.initElements(driver, LoginPracticeAutomation.class);

        // Perform login
        loginPageEasyCal.login_EasyCal("student", "Password123");

        // Close browser
        driver.quit();
    }
}

