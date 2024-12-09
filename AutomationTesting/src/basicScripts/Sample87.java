package basicScripts;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample87 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
    driver.get("https://login.yahoo.com/?.src=ym&lang=en-US&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly9pbi5zZWFyY2gueWFob28uY29tL3locy9zZWFyY2g_cD15YWhvbyttYWlsK2xvZ2luJmhzcGFydD1mYyZoc2ltcD15aHMtMjQ2MSZ0eXBlPWZjX0FEREE0OUYwQThEX3M1OF9nX2VfZDEwMjQyMV9uOTk5OF9jOTk5JnBhcmFtMT03JnBhcmFtMj1lSnd0ajkxdWd6QU1oViUyRkZsNjNVQkRza0FjclZhTmtMYkRkYjFZdVVaalRpVjBERnRLZGZ3aWJmZkQ0JTJCdG81cmQ3JTJGazE3Y1BRcFFpazVmRHRmZDlsbVdweHpBaUZGS1FiNm8lMkYzWk1iTjExelJUeEpPYVZoWE52QnE2NzMlMkJEU2V1dUhIdGEySkZFZllyYTYlMkZEJTJCc00lMkZRS0VISFB3Z3BZNWZHdTVCek9PclYzdHJYRkxwT0tFeHhwMnpXUHAyZ08wcnJGUTI2b1o5bEE5cHFHekVjWEVNUlRNNXN0TTduOGx4SnEzWDBLQTJVNGI2eE5TaGhyWlMzSW1SbFMlMkJzaUpPQ2xZcUt1VXBsYnBRSXZpcllCYiUyQlUlMkI5aGd0NVJINFU2aHNPcCUyQlB3RnV3eFMlMkZnJTNEJTNE%26guce_referrer_sig%3DAQAAABYeuDI41Jp6XuhMqKrRYWiUamFjdDVfUFVKBC79stl4AqB_wEsZK-619Re1b7vvKgSaTYqxV7a1bBsaeSs_Lr4k5Abx_tbiPuhKpXZ8dEOusAd4DmqZZ4jLnGKRpvm26h2sPMUz4a1t2qsOkgLD2sAoj6qiAvTFjuKWcW_akyHu");
	Thread.sleep(2000);
	
	driver.findElement(By.id("tpa-google-button")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("identifierId")).sendKeys("sinchanashankar98@gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Next']")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.name("Passwd")).sendKeys("aS3gh6D*013");
	Thread.sleep(2000);
	
}
}
