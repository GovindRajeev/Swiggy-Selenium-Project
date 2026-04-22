package com.swiggy.pagefactory;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryLocation {
	WebDriverWait wait;
	WebDriver driver;
	@FindBy(id = "location")  WebElement deliveryLocation;
	@FindBy(xpath = "//a[@title='Food']") WebElement foodDelivery;

	public DeliveryLocation(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		this.driver = driver;

	}

	public void setDeliveryLocation() {
	wait.until(ExpectedConditions.visibilityOf(deliveryLocation)).sendKeys("Ernakulam");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ernakulam, Kerala, India']"))).click();
	}
	
//	public void setDeliveryLocation(String location) {
	
//	wait.until(ExpectedConditions.visibilityOf(deliveryLocation)).sendKeys(location);

//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='"+location+"']"))).click();
//	
//	}
//
//	public void setDeliveryLocation(String location) {   //this is done for dynamic xpath generation and also to read data from excel
//		deliveryLocation.sendKeys(location);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'" + location + "')]"))).click();
//	}
	public void chooseFoodDelivery() throws Exception {
//     Actions oActions=new Actions(driver);
//	oActions.moveToElement(foodDelivery).perform();
     Thread.sleep(5000);
		
		wait.until(ExpectedConditions.visibilityOf(foodDelivery)).click();
	}
}
