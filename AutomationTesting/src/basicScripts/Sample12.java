package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // ctrl+shift+O
import org.openqa.selenium.firefox.FirefoxDriver; //login to instagram using cssSelector

public class Sample12
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com");
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("sinchana");
			driver.findElement(By.cssSelector("input[name='password']")).sendKeys("sinchana123");
			driver.findElement(By.cssSelector("div[class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();

		}

	}



