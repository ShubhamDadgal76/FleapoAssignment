package com.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pages.SuperlinkLoginpage;

public class loginTestPage {

	WebDriver driver;
	SuperlinkLoginpage lp;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://develop-v2.superlink.io/");
		driver.manage().window().maximize();
		lp = new SuperlinkLoginpage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 0)
	public void checkloginToApplication() {
		lp.loginToApplication();

	}

	@Test(priority = 1)
	public void checkEnterLoginNumber() throws Exception {
		lp.enterLoginNumber();

	}

	@Test(priority = 2)
	public void checkEnterOTP() throws Exception {

		lp.enterOtpAndNavigateToHomepage();
	}

}
