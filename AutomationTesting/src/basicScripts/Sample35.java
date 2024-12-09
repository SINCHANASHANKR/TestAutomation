package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; // OPEN AMAZON AND FETCH ATTRIBUTE VALUE OF ALL THE LINKS

public class Sample35 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		 List<WebElement> links = driver.findElements(By.xpath("//a"));
		 
		 for(WebElement we :links)
		 {
			 System.out.println(we.getAttribute("href"));
		 }

	}

}
