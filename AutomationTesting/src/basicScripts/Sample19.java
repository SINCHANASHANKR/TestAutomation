package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; // Open youtube and like a video- like nor working

public class Sample19 { // WAS to like a youtube video

	public static void main(String[] args) throws InterruptedException
	{
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/watch?v=fqLCas2sWW0");
			driver.findElement(By.xpath(" //button [@title='I like this']")).click(); // it didn't work count is not 1
			
		}

	}

}
