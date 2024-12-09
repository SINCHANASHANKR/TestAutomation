package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample38 { ////WAS TO SELECT MULTIPLE OPTIONS FROM A DROPDOWN AND check whether the dropdown is multi select or not
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("nandanas"));
	
		Select s = new Select(ele);
		s.selectByIndex(0);
		Thread.sleep(2000);
		
		s.selectByValue("l");
		Thread.sleep(2000);
		
		s.selectByVisibleText("chitranna");
		Thread.sleep(2000);
		
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println(" dropdown is multiselect");
		}
		else
		{
			System.out.println(" dropdown is not multi-select");
		}

}
}