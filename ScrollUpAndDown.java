package com.CountingImagesAndLinks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpAndDown {

    WebDriver driver;

    @Test(priority = 0)
    public void Test() throws InterruptedException {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5900)");
        Thread.sleep(6000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)");
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 1)
    public void Test2() throws InterruptedException {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.abhibus.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5900)");
        Thread.sleep(6000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)");
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 2)
    public void Test3() throws InterruptedException {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.apple.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5900)");
        Thread.sleep(6000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)");
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 3)
    public void Test4() throws InterruptedException {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.zoho.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5900)");
        Thread.sleep(6000);

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)");
        Thread.sleep(2000);

        driver.quit();
    }

    @Test(priority = 4)
    public void Test5() throws InterruptedException {

        driver = new ChromeDriver();
        driver.navigate().to("https://www.nationalgeographic.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.quit();
    }


}

