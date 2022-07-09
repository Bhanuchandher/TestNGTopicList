package com.TestNGTopicsList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	@Test
	public void assert1() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/bhanu/eclipse-workspace/com.TestNGPractice/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lunch the browser");
		driver.get("http://automationpractice.com/index.php");
		System.out.println("Site is opened");
		
		SoftAssert softasrt = new SoftAssert();
		
		
		String ExpectedTitle = "My Stores";
		String ActualTitle = driver.getTitle();
		softasrt.assertEquals(ExpectedTitle, ActualTitle, "Title is not matched");
		
		String Expectedurl = "http://automationpractice.com/index.php";
		String Actualurl = driver.getCurrentUrl();
		softasrt.assertEquals(Expectedurl, Actualurl, "URL is not matched");
	
		driver.close();
	}

}
