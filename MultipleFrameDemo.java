package com.MutltipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class MultipleFrameDemo {
	WebDriver driver;
	@Test
	public void MultipleFrame() throws InterruptedException{
		driver =new ChromeDriver();
		driver.navigate().to("C:\\SeleniumJavaPrograms/iframe.html");
		driver.manage().window().maximize();
		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames:" + totalnoofframes);
		
		// navigate to easy calculation
		driver.switchTo().frame("easycalculation");
		driver.navigate().to("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		String title = driver.getTitle();
		System.out.println("title");
		
		//navigate to main page 
		
		driver.navigate().to("C:\\SeleniumJavaPrograms/iframe.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		
		//navigate to second page
		driver.switchTo().frame("Selenium");
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Downloads']")).click();
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.navigate().to("C:\\SeleniumJavaPrograms/iframe.html");
		
		driver.switchTo().frame("My Store");
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghubn@123");
		driver.findElement(By.xpath("//button[@id='submit']"));
		String title2 = driver.getTitle();
		System.out.println(" title2");
		Thread.sleep(5000);
		driver.quit();
		
		
				
		
		
		
		
		
	}

}
