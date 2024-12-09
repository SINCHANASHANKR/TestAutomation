package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; //WAS TO FETCH THE ATTRIBUTE VALUE OF AN ELEMENT IN A WEBPAGE

public class Sample30 {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
WebElement ele = driver.findElement(By.xpath("//p[@class='_ab25']"));
String title = ele.getAttribute("class");
System.out.println(title);
Thread.sleep(2000);
driver.quit();
}
}
