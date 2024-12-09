package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample31 { // WAS TO PERFORM ALL ACTIONS OF WEBELEMNET

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1"); //ENTER URL WITHOUT USING GET METHOD
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	driver.navigate().to("https://www.facebook.com"); // LAUNCH ONE MORE PAGE IN SAME BROWSER
	Thread.sleep(2000);
	driver.navigate().back(); // NAVIGATES BACK
	Thread.sleep(2000);
	driver.navigate().forward(); // NAVIGATES FORWARD
	Thread.sleep(2000);
	driver.navigate().back(); // NAVIGATES BACKWARD
	Thread.sleep(2000);
	driver.navigate().refresh(); // REFRESHES THE PAGE
	Thread.sleep(2000);
	
	WebElement ele = driver.findElement(By.xpath("//a[@aria-current='page']"));
	String text = ele.getText(); // FETCHES THE TEXT VALUE OF THE ELEMENT
	System.out.println(text);
	
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//a[@href='/ui/button']"));
  String AV = ele1.getAttribute("class"); // FETCHES THE ATTRIBUTE VALUE OF THE ELEMENT
  System.out.println(AV);
  
  Thread.sleep(2000);
 Point L = ele1.getLocation(); // FETCHES THE LOACTION OF THE ELEMENT
 System.out.println(L);
 
 Thread.sleep(2000);
  String color = ele1.getCssValue("color"); //FETCHES THE COLOR OF THE ELEMENT
  System.out.println(color);
  
  Thread.sleep(2000);
  int h = ele1.getSize().getHeight();//FETCHES THE HEIGHT OF THE ELEMENT
  System.out.println(h);
 int w = ele1.getSize().getWidth();//FETCHES THE WIDTH OF THE ELEMENT
  System.out.println(w);
  
  Thread.sleep(2000);
  Dimension d = new Dimension(400,500); 
  driver.manage().window().setSize(d); //RE-SIZES THE BROWSER
  
  Thread.sleep(2000);
  Point p = new Point(200,300);
  driver.manage().window().setPosition(p); //DRAG THE BROWSER
  
  Thread.sleep(2000);
  driver.manage().deleteAllCookies(); //DELETE ALL THE COOKIES 
  
  driver.navigate().forward();
	Thread.sleep(2000);
  
  
  
  

	}

	
}
