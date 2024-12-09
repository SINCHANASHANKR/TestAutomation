package basicScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample72 { // COUNT OF BROWSERS, PRINT THE ADRESS, AND SWITCH THE CONTROL TO KANNADA TAB, WITHOUT USING FOR EACH LOOP-TASK
	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	 WebElement rClick = driver.findElement(By.xpath("//a[text() = 'ಕನ್ನಡ']"));
	Actions act = new Actions(driver);
	act.contextClick(rClick).perform();
	Thread.sleep(2000);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);

	 Set<String> allWh = driver.getWindowHandles();
	 
	 ArrayList<String> l = new ArrayList<String>(allWh);
	 
	 int count = l.size();
	 System.out.println(count);
	 
	 String childbrwsr = l.get(1);
	 driver.switchTo().window(childbrwsr);
	 
	 
	/* int count = allWh.size();
	System.out.println(count);
		
	 for(String ad : allWh)
	 {
		 
     driver.switchTo().window(ad);
	 System.out.println(ad);//THIS CAN BE DONE USING FOR EACH LOOP 
	 
	 }*/
	 
	}
}

