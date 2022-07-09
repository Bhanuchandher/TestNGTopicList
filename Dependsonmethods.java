package com.TestNGTopicsList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependsonmethods {
	WebDriver driver = null;
	
	@Test
	public void login() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/bhanu/eclipse-workspace/com.TestNGTopicsList/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		String expectedtitle = "My Strores";
		String actualtitle = driver.getTitle();
		
		Assert.assertEquals(expectedtitle, actualtitle, "Title is mismatch");
	}
	
	@Test(dependsOnMethods = {"login"})
	public void windowclose() {
		
		driver.close();
	}

}
