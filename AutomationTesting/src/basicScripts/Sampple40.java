package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sampple40 {//WAS TO FETCH THE TEXT OF ALL THE OPTIONS IN YEAR DROPDOWN

		public static void main(String[] args) throws InterruptedException
		{
			System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/r.php");
			Thread.sleep(2000);
			
	  WebElement ele = driver.findElement(By.id("year"));
	  
	  Select s = new Select(ele);
	  List<WebElement> opt = s.getOptions();
	  
	  for (WebElement we : opt) 
	  {
		  System.out.println(we.getText());
		
	}
    
	  
	 
	  

		 

	}
}

