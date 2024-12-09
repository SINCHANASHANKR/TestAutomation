package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample32 {
	public static void main(String[] args) throws InterruptedException   // WAS TO CHECK THE BOX  AND CLEAR THE BOX IN REVERSE ORDER
                                                                        // USING FOR LOOP AND USING FIND ELEMENTS
	
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/5checkbox.html");
	Thread.sleep(2000);
	
	 List<WebElement> chkbox = driver.findElements(By.xpath("//input"));
	int count = chkbox.size();
	
	for(int i=0; i<count; i++)
	{
		WebElement we = chkbox.get(i);
		we.click();
	}
	Thread.sleep(2000);
	for(int i=count-1; i>=0; i--)
	{
		WebElement we = chkbox.get(i);
		we.click();
	}
}
}
