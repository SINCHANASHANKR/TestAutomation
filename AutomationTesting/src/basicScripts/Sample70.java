package basicScripts;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample70 {// TASK GIVEN TO US -Was TO OPEN A WEB PAGE SCROLL DOWN GET SS OF A ELEMENT THEN SCROLL UP GET SS OF A ELEMENT THEN AGAIN SCROLL DOWN GET SS OF COMPLETE PAGE

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Choose a country/region for shopping.']"));
		
		Point loc = ele.getLocation();
		int yaxis = loc.getY();
		System.out.println(yaxis);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, "+yaxis+")"); 
		Thread.sleep(2000);
		
		String photo = "./Failed/";
		  Date d = new Date();
		  String d1 = d.toString();
		  String d2 = d1.replaceAll(":", "-");
		  
		File src = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File(photo+d2+"first.jpeg");
		FileHandler.copy(src, dest);
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Point loc1 = ele1.getLocation();
		int yaxis1 = loc.getY();
		System.out.println(yaxis1);
		
		js.executeScript("window.scrollBy(0, "+-yaxis1+")"); 
		Thread.sleep(2000);
		
		File src1 = ele1.getScreenshotAs(OutputType.FILE);
		File dest1 = new File(photo+d2+"second.jpeg");
		FileHandler.copy(src1, dest1);
		
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='English']"));
		Point loc2 = ele2.getLocation();
		int yaxis2 = loc.getY();
		System.out.println(yaxis2);
		
		js.executeScript("window.scrollBy(0, "+yaxis2+")"); 
		Thread.sleep(2000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src2 = ts.getScreenshotAs(OutputType.FILE);
		File dest2 = new File(photo+d2+"third.jpeg");
		FileHandler.copy(src2, dest2);
}
}
