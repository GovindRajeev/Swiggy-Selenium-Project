package com.swiggy.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenuSelection {
	WebDriverWait wait;
	WebDriver driver;

	// @FindBy(xpath =
	// "((//div[@data-testid='normal-dish-item'])[2]//div[text()='Add'])[2]")
	// WebElement secondDishItem;

//	@FindBy(xpath = "((//div[contains(@data-testid,'normal-dish-item')])[2]//div[contains(text(),'Add')])[2]")
//	WebElement secondDishitem;
	@FindBy(xpath = "( (//div[@data-testid='normal-dish-item'])[2]//button[div[contains(text(),'Add')]])[2]") WebElement secondDishitem;

// @FindBy(xpath =
// "(//div[contains(@data-testid,'normal-dish-item')])[2]//div[contains(text(),'+')]")
//	WebElement addOnemoreItem;

//	@FindBy(xpath = "(//div[contains(@data-testid,'normal-dish-item')])[2]//button[contains(@class,'add-button-right-container')]") WebElement addOnemoreItem;

//	@FindBy(xpath = "(//button[contains(@class, 'add-button-right-container')]//div[text() = '+'])[2]") WebElement  addOnemoreItem;

//	@FindBy(xpath = "(//button[contains(@class, 'add-button-right-container')])[2]") WebElement  addOnemoreItem;
//	@FindBy(xpath = "//button[contains(@class, 'sc-jlGgGc')]//div[text()='2']") WebElement addOnemoreItem;

	@FindBy(xpath = "(//div[@data-testid='normal-dish-item'])[2]//button[div[text() = '+']]") WebElement addOnemoreItem;

	// @FindBy(xpath = "//button[@id='view-cart-btn']//span[text()='View Cart']")
//	WebElement viewCart;

	@FindBy(xpath = "//button[@id='view-cart-btn']") WebElement viewCart;

	public MenuSelection(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.driver = driver;
	}

	public void ChooseDishItem() throws Exception {
		wait.until(ExpectedConditions.elementToBeClickable(secondDishitem)).click();

		Thread.sleep(1000);

//		Actions oactions = new Actions(driver);
//		oactions.moveToElement(addOnemoreItem).perform();

//     wait.until(ExpectedConditions.elementToBeClickable(addOnemoreItem)).click();

	}

	public void clickViewCart() throws Exception {

		Thread.sleep(5000);

		wait.until(ExpectedConditions.visibilityOf(viewCart)).click();
	}

}
