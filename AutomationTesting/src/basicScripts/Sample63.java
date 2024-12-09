package basicScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample63 { //1ST MOCK QSTN - WAS TO FETCH THE TEXT OF ODD (indexed)OPTIONS FROM A DROPDOWN

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
		 WebElement ele = driver.findElement(By.id("month"));
		 Select s = new Select(ele);
		 
		List<WebElement> opt = s.getOptions();                             //month - index
		int count = opt.size();                                            // jan -   0
		                                                                   // feb -   1
		for(int i=1;i<count;i=i+2)                                         // march - 2
		{                                                                  // april - 3
			WebElement text = opt.get(i);
			String options = text.getText();
			System.out.println(options);
		}

	}

}
