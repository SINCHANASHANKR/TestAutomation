package basicScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver; //Open facebook verify partially(contains) if the title is Facebook if so print test case pass


public class Sample24 
{
	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	//System.out.println(title);
	if(title.contains("Facebook"))
	{
		System.out.println("Test case pass");
	}
	else
	{
		System.out.println("Test case fail");
	}

}

}

