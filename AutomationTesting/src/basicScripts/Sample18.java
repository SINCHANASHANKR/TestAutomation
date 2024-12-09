package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample18 {

	public static void main(String[] args) throws InterruptedException //OPEN FLIPKART SEARCH FOR A PHONE AND PURCHASE THE PHONE (PHONE DETSILS PAGE OPENS IN THE NEXT TAB)
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("vivo mobiles");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[.='vivo V30 Pro 5G (Classic Black, 256 GB)']")).click();
		
		driver.get("https://www.flipkart.com/vivo-v30-pro-5g-classic-black-256-gb/p/itmd7b7a1700c431?pid=MOBGYGCBEM4PVYYM&lid=LSTMOBGYGCBEM4PVYYMM3TTW6&marketplace=FLIPKART&q=vivo+mobiles&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=organic&iid=en_mu6QkSCNWls02oRsSS2K0EdXQzPnN2Jpidgv25u0Wu8iKEPauBRvUIMPhyuZl4IhicYmdqTMoR9hX4uWl0Phpg%3D%3D&ppt=pp&ppn=pp&ssid=siyaxqt95rrtkem81729149597771&qH=278bf4990ddc16ab'");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type = 'button']")).click(); // not able to click on buy now bcz the page gets loaded in the new tab and we have to use switchto methods.......
	

	}

}
