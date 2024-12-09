package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample69 { // WAS TO SCROLL TO THE FACEBOOK LINK IN AMAZON.IN AND CLICK ON IT
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'Facebook']"));
		
		Point loc = ele.getLocation();
		int yaxis = loc.getY();
		System.out.println(yaxis);//find y axis value 
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0, "+yaxis+")"); //concat it here don't hardcode data, the element location may change
		Thread.sleep(4000);
		
		ele.click();

}
}
