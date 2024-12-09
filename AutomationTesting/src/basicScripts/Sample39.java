package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample39 { //WAS TO FETCH THE COUNT OF NO.OF MONTHS IN FB PAGE USING BELOW URL
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
  WebElement ele = driver.findElement(By.id("month"));
  
  Select s = new Select(ele);
  
 List<WebElement> opt = s.getOptions();
 System.out.println(opt.size());
  

	 

}
}
