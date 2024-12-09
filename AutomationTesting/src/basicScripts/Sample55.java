package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample55 {//WAS TO PERFORM DOUBLE CLICK ACTION
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement dClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(dClick).perform();
		

}
}


