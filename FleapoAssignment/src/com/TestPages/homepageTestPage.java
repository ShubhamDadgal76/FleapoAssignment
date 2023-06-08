package com.TestPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.pages.SuperlinkLoginpage;
import com.pages.homepage;

public class homepageTestPage {
	WebDriver driver;
	homepage hp;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://develop-v2.superlink.io/creator/page#");
		driver.manage().window().maximize();
		hp = new homepage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test(priority = 0)
	public void checkProvidePageName() {
		hp.providePageName();
	}

	@Test(priority = 1)
	public void checkProvideIntroMsg() {
		hp.provideIntroMsg();
	}

	@Test(priority = 2)
	public void checkProvideSocialLink() {
		hp.provideSocialLink();
	}

	@Test(priority = 3)
	public void checkAddSocialLink() {
		hp.addSocialLink();
	}

	@Test(priority = 4)
	public void checkaddButton() {
		hp.addButton();
	}

	@Test(priority = 5)
	public void checkclickEnableButton() {
		hp.clickEnableButton();
	}

	@Test(priority = 6)
	public void checkclickMonitizationSetting() {
		hp.clickMonitizationSetting();
	}

	@Test(priority = 7)
	public void checkclickippingButton() {
		hp.clickippingButton();
	}

	@Test(priority = 7)
	public void checkcnavigateToMonetizationPage() {
		hp.navigateToMonetizationPage();
	}

}
