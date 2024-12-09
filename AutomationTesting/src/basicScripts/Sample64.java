package basicScripts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample64 { // 1ST MOCK-Q2-SORT ELEMENTS OF A DROPDOWN IN ASC & DESC ORDER BY USING TREESET
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s = new Select(ele);
		 
		 List<WebElement> opt = s.getOptions();
		 
		 TreeSet<String> t = new TreeSet<String>();
		 
		 for(WebElement we : opt)
		 {
			 String text = we.getText();
			 t.add(text);
		 }
		 
		 for(String t1 : t)
		 {
			 System.out.println(t1);
		 }
		
		 TreeSet<String> t2 = new TreeSet<String>(Collections.reverseOrder());
		 t2.addAll(t);
		 
		 System.err.println("options in descending order");// just to differentiate between asc and desc
		 
		 for(String t3 : t2)
		 {
			 System.out.println(t3);
		 }
		 
	}

}
