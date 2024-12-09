package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample33 {
	public static void main(String[] args) throws InterruptedException // WAS TO PASS THE DATA  INTO TEXTFIELD AND CLEAR THE DATA IN REVERSE ORDER
	                                                                    // USInG FOR LOOP AND USING FIND ELEMENTS
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/5textfields.html");
	Thread.sleep(2000);
	
	 List<WebElement> TF = driver.findElements(By.xpath("//input"));
	int count = TF.size();
	
	for(int i=0; i<count; i++)
	{
		WebElement we = TF.get(i);
		we.sendKeys("sinchana");
	}
	Thread.sleep(2000);
	for(int i=count-1; i>=0; i--)
	{
		WebElement we = TF.get(i);
		we.clear();
	}
}
}


