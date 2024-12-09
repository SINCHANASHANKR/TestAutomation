package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;//WAS to inspect API docs in Java Script in SElenium WEbpage using chrome browser

public class Sample22 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='JavaScript']/../p[4]")).click(); // we should support the page by scrolling ourselves so that it gets clicked on the API docs
	}
}