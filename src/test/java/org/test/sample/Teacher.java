package org.test.sample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Teacher {
	@BeforeClass
	public static void subject1() {
		System.out.println("BeforeClass");
	}
	@Before
	public  void subject2() {
		System.out.println("BeforeMethod----Subject2");
	}
	@Test
	public void subject3() throws InterruptedException {
		System.out.println("Test------Subject3");
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		Actions a=new Actions(driver);
		driver.get("https://www.shopclues.com/wholesale.html ");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	//	WebElement cancelLogin=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		
		WebElement search=driver.findElement(By.xpath("(//input[@id='autocomplete'])[1]"));
		search.sendKeys("cooler");
		Thread.sleep(2000);
		String attribute = search.getAttribute("value");
		
		assertEquals("CoOler", attribute);
	
		
		WebElement firstProduct=driver.findElement(By.xpath("(//a[@class='anchorHighlight'])[1]"));
		firstProduct.click();
		
	}
	@After
	public void subject4() {
		System.out.println("AfterMethod----Subject4");
	}
	@AfterClass
	public static void subject5() {
		System.out.println("AfterClass");
	}
	
	
}
