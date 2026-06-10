package com.CountingImagesAndLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NumberOfImagesAndLinks {

    @Test
    public void test() throws InterruptedException {

        WebDriver driver;

        String url = "https://www.nopcommerce.com/en";

        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();

        Thread.sleep(3000);

        // Hover on "Support & services"
        WebElement ele = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));
        Actions act = new Actions(driver);
        act.moveToElement(ele).perform();

        Thread.sleep(2000);

        // Hover on "Training"
        WebElement ele1 = driver.findElement(By.xpath("//span[normalize-space()='Training']"));
        act.moveToElement(ele1).perform();

        Thread.sleep(3000);

        // Count links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + links.size());

        // Count images
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total Images: " + images.size());

        driver.quit();
    }
}
