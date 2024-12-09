package basicScripts;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample71 { //OPEN A BROWSER AND GET THE ADDRESS OF IT BY USING WINDOW HANDLER
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		String address = driver.getWindowHandle();
		System.out.println(address);*/
		
		
		
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		String p_id = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		allwh.remove(p_id);
		
		
		for (String wh : allwh)
		{
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
		     Thread.sleep(6000);
			driver.close();
		}
		
		

}
}
