package basicScripts;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample80 { //OPEN DEMO APPS-SCROLL PAGE-CLICK OPEN NEW TAB-SWITCH CONTROL SCROLL BOTTOM CHECK THE CHECKBOX-CLICK ON ACCEPT BUTTON -CAPTURE SS OF POPUP THANKYOU..
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
	
	Set<String> tab = driver.getWindowHandles();
	
	for (String wh : tab)
	{
		driver.switchTo().window(wh);
	}
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//span[text()='I have read all the terms and conditions']"));
	Point loc = ele.getLocation();
	int yaxis = loc.getY();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,"+yaxis+")");
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	driver.findElement(By.xpath("//button[text()='Accept Our Policy']")).click();
	
	String photo = "./Failed/";
	Date d = new Date();
	String d1 = d.toString();
	String d2 = d1.replace(":", "-");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dst = new File(photo+d2+"thankyou.jpeg");
	FileHandler.copy(src, dst);
	
	
}
}
