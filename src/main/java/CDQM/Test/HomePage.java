package CDQM.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class HomePage {
	static WebDriver driver;
@BeforeTest	
	public  void home() throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "D:\\Users\\C-PG4P\\eclipse-workspace\\Reports\\Driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://ibmcdqm-test.truvenhealth.com/dct/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_username")).sendKeys("qatest");			
		driver.findElement(By.id("login_password")).sendKeys("Cdqm@0987654321");
		driver.findElement(By.id("login_pin")).sendKeys("rsapin02");
		driver.findElement(By.id("login-submit")).click();
		Thread.sleep(7000);
		WebElement w= driver.findElement(By.id("_ctl0_PageMeat_drpHCO"));
		Select s = new Select(w);
		//s.selectByIndex(0);
		s.selectByIndex(0);
		driver.findElement(By.className("submitButton")).click();
		
			}
		
		/*s.selectByValue("* Great Care Hospital");
		boolean b = s.isMultiple();
		System.out.println(b);
		List<WebElement> o = s.getOptions();
		for (WebElement r:o) {
System.out.println(r.getText());
		}
	driver.findElement(By.className("submitButton")).click();
	/*	driver.findElement(By.id("_ctl0_PageMeat_btnGo")).click();*/
	}
	


