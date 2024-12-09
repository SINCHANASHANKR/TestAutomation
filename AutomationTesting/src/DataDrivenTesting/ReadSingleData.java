package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadSingleData { //WAS TO READ THE DATA FROM EXCEL AND PASS IT TO FB PAGE
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("./Testdata/Facebook Credentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(0);
		String username = cell.getStringCellValue();
		System.out.println(username);
		
		XSSFRow row1 = sheet.getRow(1);
		XSSFCell cell1 = row1.getCell(1);
		String psw = cell1.getStringCellValue();
		System.out.println(psw);
		
		
		workbook.close();
		fis.close();
		
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	//Thread.sleep(2000);

	WebElement email = driver.findElement(By.id("email"));
	email.sendKeys(username);
	
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys(psw);
}
}
