package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class monetizationPage {
	WebDriver driver;

	@FindAll({
			@FindBy(xpath = "//div[@class=\"PressableCore PressableCore--cursor--text PressableCore--height--medium PressableCore--radius--all PressableCore--width PressableCore--width--auto PressableField CodePuncher-pressable Box-root Flex-inlineFlex\"]") })
	List<WebElement> codeBoxes;

	public monetizationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterCode() {

		String otp = "000000";
		String[] otpDigits = otp.split("");

		List<WebElement> textBoxes = driver.findElements(By.xpath("//div[@class=\"mx-2 flex-1\"]"));

		for (int i = 0; i < textBoxes.size() && i < otpDigits.length; i++) {
			WebElement textBox = textBoxes.get(i);
			textBox.clear();
			textBox.sendKeys(otpDigits[i]);
		}

	}
}
