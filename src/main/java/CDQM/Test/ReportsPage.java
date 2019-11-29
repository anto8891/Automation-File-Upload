package CDQM.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.io.BufferedReader;

public class ReportsPage extends HomePage  {
	
	String d="";
@Test	
public void reportspage() throws InterruptedException, IOException {
	driver.findElement(By.id("nlReports")).click();
	Thread.sleep(3000);
	String s = driver.getTitle();
	System.out.println(s);
	List<WebElement> trows = driver.findElements(By.tagName("tr"));
	for(int j=1; j<=1;j++) {
		List<WebElement> tdata = driver.findElements(By.tagName("td"));
		for(int k=0; k<=1;k++) {
			d = tdata.get(k).getText();
			System.out.println(d);
			  
			
			
		    }
		}
	
	BufferedReader reader = new BufferedReader (new FileReader("D:\\Users\\C-PG4P\\eclipse-workspace\\Test\\src\\main\\java\\ReportsPage"));
	String line = reader.readLine();
	
	if(line == d) {
		
		
		System.out.println("No Errors Found");
	}
	
	else {
		System.out.println("Error Found");
		
	}
	   
	   }
}

	
	
		
	
	
