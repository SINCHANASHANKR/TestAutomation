package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample65 { //WAS TO TAKE SCREENSHHOT OF AN email text field in fb page
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("email"));
		
		
		File scr = ele.getScreenshotAs(OutputType.FILE);
		
		File dst = new File("C:\\Users\\Chiranjeevi Gowda\\OneDrive\\Attachments\\TakeScreenshot\\SS2");
		
		FileHandler.copy(scr, dst);

}
}
