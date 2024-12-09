package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample42 {// WAS TO SORT ALL THE OPTIONS IN ASCENDING ORDER USING ARRAYLIST

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
  WebElement ele = driver.findElement(By.id("month"));
  
  Select s = new Select(ele);
  
  ArrayList<String> l = new ArrayList<String>();
	
  List<WebElement> opt = s.getOptions();
  
  for (WebElement we : opt) 
  {
    String months = we.getText();
    
	 l.add(months);
		
	}
  Collections.sort(l);
  
	for(String l1:l)
	{
		System.out.println(l1);
	}
	
}

	}



