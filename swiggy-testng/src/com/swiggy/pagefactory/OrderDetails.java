package com.swiggy.pagefactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderDetails {
WebDriverWait wait;
//@FindBy(xpath = "//div[text()='New to Swiggy?']") WebElement clickNewtoSwiggy;

@FindBy(xpath = "//div[text()='New to Swiggy?']//parent::div") WebElement clickNewtoSwiggy;

@FindBy(xpath = "//a[text()='CONTINUE']") WebElement clickContinue;
@FindBy(id="mobile") WebElement MobileNoIp;
@FindBy(id="name") WebElement nameIp;
@FindBy(id = "email") WebElement emailIp;
public OrderDetails(WebDriver driver) {
PageFactory.initElements(driver, this);
	this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
}


public void clickNewToSwiggy() {
	
	wait.until(ExpectedConditions.visibilityOf(clickNewtoSwiggy)).click();
}
  
public void ClickContinue() {
	wait.until(ExpectedConditions.elementToBeClickable(clickContinue)).click();
}

public void SetCustomerDetails() {
	wait.until(ExpectedConditions.visibilityOf(MobileNoIp)).sendKeys("9895678901");
    wait.until(ExpectedConditions.visibilityOf(nameIp)).sendKeys("Miya");
    wait.until(ExpectedConditions.visibilityOf(emailIp)).sendKeys("miya011@gmail.com");
}


}
