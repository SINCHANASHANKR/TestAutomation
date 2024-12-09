package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample52 { //WAS TO OPEM DEMO APPS

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.xpath("//select[@id='select3']"));
		 Select s = new Select(ele);
		 Thread.sleep(2000);
		 s.selectByIndex(1);
		 
		driver.findElement(By.xpath("//a[.='Multi Select']")).click();
		Thread.sleep(2000);
		
		WebElement ele1 = driver.findElement(By.id("select-multiple-native"));
		 Select s1 = new Select(ele1);
		 Thread.sleep(2000);
		 s1.selectByIndex(1);
		 s1.selectByIndex(2);
		 
		 driver.findElement(By.xpath("//a[.='Disabled']")).click();
			Thread.sleep(2000);
			
			WebElement ele3 = driver.findElement(By.id("SelectCountry"));
			boolean b = ele3.isEnabled();
			
			/*Select s3= new Select(ele3);
			 Thread.sleep(2000);
			 
			 
			List<WebElement> opt = s3.getOptions();
			 
			 for(WebElement we:opt)
			 {
				boolean b = we.isEnabled();
			 }*/
			 
			 
			if(b)
			 {
				 System.out.println("dd is enabled");
			 }
			 
			 else
			 {
				 System.out.println("dd is disabled");
			 }
			 
			 
			
			
			
		 
		 
		 
		 
		

	}

}
