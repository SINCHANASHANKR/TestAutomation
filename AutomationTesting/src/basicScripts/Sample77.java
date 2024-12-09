package basicScripts;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample77 { //WAS TO CLOSE ONLY THE CHILD BROWSERS
	
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://skpatro.github.io/demo/links/");
	Thread.sleep(2000);
	
	driver.findElement(By.name("NewWindow")).click();
	
	String p_id = driver.getWindowHandle();//parent address
	Set<String> allWh = driver.getWindowHandles();// both address
	
	System.out.println(allWh.size());//count of browsers
	
	allWh.remove(p_id);//remove parent browser 
	
	System.out.println(allWh.size());//count of browsers after removing the parent browser
	
	for(String wh : allWh)
	{
		driver.switchTo().window(wh);
		Thread.sleep(2000);
		driver.close();
	}
}
}
