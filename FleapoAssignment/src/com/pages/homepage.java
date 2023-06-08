package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	WebDriver driver;

	@FindBy(xpath = "//input[@value='komalkomalkomalkomalkomalkomalkomalkokomalkomalkom']")
	WebElement pageNameTextBox;

	@FindBy(xpath = "//textarea[@id='IntroMessage']")
	WebElement introMessageTextBox;

	@FindBy(xpath = "//h5[text()='Social Links']/following::div[@class=\"py-4 px-3 border border-gray-350 rounded flex-center-start gap-2.5 bg-white\"][1]")
	WebElement socialLink;

	@FindBy(xpath = "//input[@placeholder=\"userfour\"]")
	WebElement provideId;

	@FindBy(xpath = "//button[@class=\"cta button w-full undefined rounded-full text-white bg-black\"]")
	WebElement clickAddButton;

	@FindBy(xpath = "//button[@class='cta button w-full mt-2 rounded-full text-white bg-black']")
	WebElement enableMessagingButton;

	@FindBy(xpath = "div[class='jsx-9c5a6c68431d5bdf'] li:nth-child(2)")
	WebElement monetizationSetting;

	@FindBy(xpath = "//div[@class='cursor-pointer']//*[name()='svg']")
	WebElement monetizationPage;

	@FindBy(xpath = "//div[@class=\"radio_btn mt-2 mb-4 flex-center-between gap-2\"]/following::label[@class=\"radio-toggle relative inline-flex items-center cursor-pointer\"]")
	WebElement tippingButton;

	public homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void providePageName() {
		pageNameTextBox.sendKeys("Shubham Dadgal");
	}

	public void provideIntroMsg() {
		introMessageTextBox.sendKeys("I am from Pune and I am interested to work with you...");
	}

	public void provideSocialLink() {
		socialLink.click();
	}

	public void addSocialLink() {
		provideId.sendKeys("shubham@gmail.com");
	}

	public void addButton() {
		clickAddButton.click();
	}

	public void clickEnableButton() {
		enableMessagingButton.click();
	}

	public void clickMonitizationSetting() {
		monetizationSetting.click();
	}

	public void clickippingButton() {
		tippingButton.click();
	}

	public monetizationPage navigateToMonetizationPage() {
		monetizationPage.click();
		monetizationPage mn = new monetizationPage(driver);
		return mn;
	}

}
