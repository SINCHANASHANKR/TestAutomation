package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample53 { //WAS to pERFORM  MOUSE HOVERING ACTION ON FASHION IN FLIPKART APP
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(ele).perform();
		

}
}
