package SpiceJet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetDemo {
	WebDriver driver;

	@Test
	public void SpiceDemo() {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.spicejet.com/");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
	}

}
