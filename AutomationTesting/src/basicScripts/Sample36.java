package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;// OPEN AMAZON AND FETCH source VALUE OF ALL THE IMAGES

public class Sample36 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		 List<WebElement>  images = driver.findElements(By.xpath("//img"));
		 
		 for(WebElement we :images)
		 {
			 System.out.println(we.getAttribute("src"));
		 }
}
}
