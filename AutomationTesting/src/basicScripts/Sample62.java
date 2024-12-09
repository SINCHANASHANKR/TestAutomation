package basicScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample62 { //WAS TO TAKE SCREENSHOT OF AN APPLICATION 

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://best.aliexpress.com/?af=amp1250&dp=113539918144217088&mfadid=adm&aff_fcid=99b316ebf0a84a7a81b3340c381ae3c2-1731139341689-00967-byrlillA&aff_fsk=byrlillA&aff_platform=link-c-tool&sk=byrlillA&aff_trace_key=99b316ebf0a84a7a81b3340c381ae3c2-1731139341689-00967-byrlillA&terminal_id=f3009ab43f584daabddc0118ca9620cc&afSmartRedirect=y");
		Thread.sleep(2000);
		
		//step1
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//step2
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//STEP3
		File dst = new File("C:\\Users\\Chiranjeevi Gowda\\OneDrive\\Attachments\\TakeScreenshot\\SS1");
		
		//step4
		FileHandler.copy(src, dst);

	}

}
