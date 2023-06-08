package com.pages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperlinkLoginpage {
	WebDriver driver;

	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginTab;

	@FindBy(xpath = "//button")
	WebElement letsStartButton;

	@FindBy(xpath = "//input[@type=\"tel\"]")
	WebElement loginNumber;

	@FindBy(xpath = "//button")
	WebElement continueButton;

	@FindAll({ @FindBy(xpath = "//div[@class='mx-2 flex-1']") })
	List<WebElement> otpInputBoxes;

	public SuperlinkLoginpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginToApplication() {
		loginTab.click();
		letsStartButton.click();

	}

	public void enterLoginNumber() throws Exception {
		Thread.sleep(3000);
		loginNumber.sendKeys("4444444444");
		continueButton.click();
	}

	public homepage enterOtpAndNavigateToHomepage() throws Exception {

		String otp = "123456";
		String[] otpDigits = otp.split("");

		List<WebElement> textBoxes = driver.findElements(By.xpath("//div[@class=\"mx-2 flex-1\"]"));

		for (int i = 0; i < textBoxes.size() && i < otpDigits.length; i++) {
			WebElement textBox = textBoxes.get(i);
			textBox.clear();
			textBox.sendKeys(otpDigits[i]);
		}
		homepage hp = new homepage(driver);
		return hp;
	}

}
