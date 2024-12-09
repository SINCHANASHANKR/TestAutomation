package basicScripts;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample51 { // CONCEPT OF TYPECASTING
	
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
		 
		// ArrayList< String> l = new ArrayList<String> ();
		 
		 TreeSet<String> l = new TreeSet<String> ();
		 
		 for(WebElement we :opt)
		 {
			String t = we.getText();
			l.add(t);
		 }
		 
		// TreeSet<String> t = new TreeSet<String>(l); //TYPE CASTING FROM ARRAYLIST TO TREESET
		// System.out.println(t);
		 
		 ArrayList< String> t = new ArrayList<String> (l); //TYPE CASTING FROM TREESET TO ARRAYLIST
		 System.out.println(t);
		 
		 

}
}
