package basicScripts;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;//WAS to inspect API docs in Java Script in SElenium WEbpage using Firefox browser

public class Sample21 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/downloads/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='JavaScript']/../p[4]")).click();// using expression to handle completely dynamic elements

	}

}
