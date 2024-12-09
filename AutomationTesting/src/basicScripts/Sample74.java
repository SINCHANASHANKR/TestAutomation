package basicScripts;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample74 { //WAS TO PRINT THE COUNT AND ADDRESS  OF BOTH THE BROWSERS
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("NewWindow")).click();
	Set<String> allWh = driver.getWindowHandles();
	
	System.out.println(allWh.size());
	
	for(String wh : allWh)
	{
		System.out.println(wh);
	}
}
}
