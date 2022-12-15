package test;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test12 {
	
public static WebDriver driver;
		

	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}

	
	@Test
	public void FaceBookTitle() {
		driver.get("https://www.facebook.com/");
		
//		WebElement ele = driver.findElement(By.name("q"));
//		ele.sendKeys("Facebook");
//		
//		driver.findElement(By.name("btnK")).click();
		
		String expectedtitle="Facebook – log in or sign up";
		String title=driver.getTitle();
		assertEquals(expectedtitle, title);    
		assertTrue(true);
		
		
	}
	
	@Test
	public void VerifyUrl() {
		driver.get("https://www.facebook.com/");
		
		String expectedurl="https://www.facebook.com/";
		String url=driver.getCurrentUrl();
		assertEquals(expectedurl, url);
		
		
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
