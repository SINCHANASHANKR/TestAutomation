package basicScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample67 { //WAS TO HANDLE DISABLED ELEMENTS & PASS THE DATA & CLEAR THE DATA
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Chiranjeevi%20Gowda/OneDrive/Attachments/disabled%20.html");
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('a1').value = 'hello'"); //PASS THE DATA
		
		Thread.sleep(2000);
		
		js.executeScript("document.getElementById('a1').value = ''");//CLEAR THE DATA

}
}
