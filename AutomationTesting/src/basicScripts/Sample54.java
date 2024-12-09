package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample54 { //WAS TO PERFORM DRAG & DROP ACTION

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html ");
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.id("box6"));
		WebElement dst = driver.findElement(By.id("box106"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDrop(src, dst).perform();
		

}
}

