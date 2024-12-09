package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script8 {

	public static void main(String[] args)throws InterruptedException
	{
	
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/demo3.html");
			Thread.sleep(2000);
			//driver.findElement(By.tagName("a")).click();
			//driver.findElement(By.id("a1")).click();
			//driver.findElement(By.name("n1")).click();
			driver.findElement(By.className("c1")).click();

	}

}
