package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample68 {//WAS TO PERFORM SCROLL ACTION THRICE DOWNWARDS AND UPWARDS IN A WEBPAGE
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i =0; i<3; i++)
		{
		js.executeScript("window.scrollBy(0,500)"); // SCROLL DOWNWARDS
		Thread.sleep(2000);
		}
		
		for(int j =0; j<3; j++)
		{
		js.executeScript("window.scrollBy(0,-500)");// SCROLL UPWARDS
		Thread.sleep(2000);
		}
}
}
