package com.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.SuperlinkLoginpage;
import com.pages.monetizationPage;

public class monitizationTestPage {
	WebDriver driver;
	monetizationPage mn;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://develop-v2.superlink.io/");
		driver.manage().window().maximize();
		mn = new monetizationPage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 0)
	public void checkEnterCode() {
		mn.enterCode();

	}
}
