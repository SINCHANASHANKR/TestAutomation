package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample48 { //Open qspiders demo apps-go TO IFRAMES- SELECT MULTIPLE IFRAME IN RHS- HANDLE 2 FRAMES & PASS THE DATA INTO TXT FLDS
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(2000);

		WebElement f1 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[1]"));
		driver.switchTo().frame(f1);
		
		Thread.sleep(2000);
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("admin@gmail.com");

		WebElement psw = driver.findElement(By.xpath("//input[@type='password']"));
		psw.sendKeys("admin@123");
		
		Thread.sleep(2000);
	    WebElement confirmpsw = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		confirmpsw.sendKeys("admin@123");
		
		driver.switchTo().defaultContent();
		
		WebElement f2 = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(f2);
		
		Thread.sleep(2000);
	    WebElement un = driver.findElement(By.xpath("//input[@name='username']"));
		un.sendKeys("admin@gmail.com");
		
		WebElement psw2 = driver.findElement(By.xpath("//input[@type='password']"));
		psw2.sendKeys("admin@123");
		
		
}
}
