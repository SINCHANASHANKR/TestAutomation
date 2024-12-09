package basicScripts;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample81 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
	Thread.sleep(2000);
	
	/*driver.findElement(By.xpath("//a[text()='Open in new window']")).click(); //1
	Set<String> allwh = driver.getWindowHandles();
	
	String p_id = driver.getWindowHandle();
	allwh.remove(p_id);
	
	for (String wh : allwh)
	{
		driver.switchTo().window(wh);
		
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("sanvi");
	Thread.sleep(2000);
	driver.close();
	}
	
	driver.switchTo().window(p_id);//switch back to parent
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='New Tab']")).click();//2
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Open window in new Tab']")).click();
    Set<String> allwh1 = driver.getWindowHandles();
	
	String p_id1 = driver.getWindowHandle();
	allwh1.remove(p_id1);
	
	for (String wh1 : allwh1)
	{
		driver.switchTo().window(wh1);
		
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("sanvi");
	Thread.sleep(2000);
	driver.close();
	}
	
	driver.switchTo().window(p_id1);//switch back to parent*/
	
	String url = "https://demoapps.qspiders.com/ui/browser/Login";
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();//3
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Click to open multiple popup windows']")).click();
	Thread.sleep(6000);
    Set<String> allwh2 = driver.getWindowHandles();
	
	String p_id2 = driver.getWindowHandle();
	allwh2.remove(p_id2);
	System.out.println(allwh2);
	for (String wh2 : allwh2)
	{
		
		driver.switchTo().window(wh2);
		Thread.sleep(2000);	
		driver.findElement(By.id("email")).sendKeys("sanvi");
	    Thread.sleep(2000);
	    if(url.equals("https://demoapps.qspiders.com/ui/browser/Login"))
	    {
	    	driver.findElement(By.id("email")).sendKeys("sanvi");
	    }
	    driver.close();
	}
	
	

}
}


