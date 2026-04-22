package com.swiggy.pagefactory;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickCakes {

	WebDriverWait wait;
	
	@FindBy(xpath = "//a[contains(@aria-label,' for cake')]/parent::div") WebElement clickCake;

	public ClickCakes(WebDriver driver) {
	PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}


public void clickCakeOption() {
	wait.until(ExpectedConditions.visibilityOf(clickCake)).click();

}

}
