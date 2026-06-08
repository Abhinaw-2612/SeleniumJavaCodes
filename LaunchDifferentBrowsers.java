package com.TestNGDemoTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchDifferentBrowsers {
	
	@Test
	public void ChromeBrowserTest() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");// Links
		// driver.manage().window().maximize();//maximize to full screen
		// Thread.sleep(3000);
		driver.manage().window().maximize();// minimizes on screen

	}

	public void FirefoxBrowserTest() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();// minimizes on screen

	}

	public void EdgeBrowserTest() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();// minimizes on screen

	}
}
