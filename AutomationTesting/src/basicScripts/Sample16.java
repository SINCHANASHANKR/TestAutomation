package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample16 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckoDriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps");
		driver.findElement(By.xpath("//span[@class='google-symbols NhBTye G47vBd']")).click();
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose starting point, or click on the map...']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-label='Choose destination, or click on the map...']")).sendKeys("Hassan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='DgCNMb ' and @role='gridcell' and@ id='sbse28x0']")).click();

	}

}
