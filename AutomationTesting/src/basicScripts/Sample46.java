package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample46 { //WAS FOR DUMMY PAGE FRAME2 FOLDER REFER NOTES FOR QUESTION.-NESTED FRAME
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/FRAME2/mainpage1.html");
		Thread.sleep(2000);
		
		WebElement usn = driver.findElement(By.xpath("//input[@type='text']"));
		usn.sendKeys("admin1");
		
		Thread.sleep(2000);
		//driver.switchTo().frame(0); //INDEX
		
		driver.switchTo().frame("f3"); //ID
		//WebElement f1 = driver.findElement(By.xpath("//iframe[@id='f1']"));
		//driver.switchTo().frame(f1);
		WebElement psw = driver.findElement(By.xpath("//input[@type='text']"));
		psw.sendKeys("admin@123");
		
        Thread.sleep(2000);
		driver.switchTo().frame("f2"); //ID
		WebElement mob = driver.findElement(By.xpath("//input[@type='text']"));
		mob.sendKeys("9876543212");
		
		 Thread.sleep(2000);
		driver.switchTo().frame("f1"); //ID
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("admin@gmail.com");
		
		Thread.sleep(2000);
		email.clear();
		
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		mob.clear();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		usn.clear();
		
	}



}

