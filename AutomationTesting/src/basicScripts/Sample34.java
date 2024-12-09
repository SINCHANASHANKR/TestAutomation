package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; // WAS TO FETCH THE TEXT OF ALL THE LINKS IN AMAZON APP USING FOR EACH LOOP

public class Sample34 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/");
	Thread.sleep(1000);
	List<WebElement> links = driver.findElements(By.xpath("//a"));
	
	for( WebElement we : links) //for each loop
	{
		System.out.println(we.getText());
	}
}
}
